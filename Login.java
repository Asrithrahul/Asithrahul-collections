package controller;

import model.Cart;
import model.User;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/**
 * Created by fwarr on 23-Sep-15.
 */
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("..Login Servlet");
        Cart cart = new Cart();
        User user = new User();

        user.setUser(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        System.out.println(user.getUser()+" "+user.getPassword());
        try {
            if(user.validate())
            {
                System.out.println("Validated");
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521", "hr", "hr");
                    PreparedStatement statement = connection.prepareStatement("SELECT * FROM USERS WHERE USERNAME = ?");
                    statement.setString(1, request.getParameter("username"));
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        user.setType(resultSet.getInt("USER_TYPE"));
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                request.getSession().setAttribute("user",user);
                request.getSession().setAttribute("cart",cart);
                response.sendRedirect("/");
            }
            else{
                RequestDispatcher rs = request.getRequestDispatcher("signup.jsp");
                rs.forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

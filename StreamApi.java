import java.util.*;
class Student{
	int id;
	String name;
	float cgpa;
	public Student(int id,String name,float cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}
}
public class StreamApi {
public static void main(String[] args) {
	List<Student> studentList =new ArrayList<Student>();
	studentList.add(new Student(1,"suchitra",98.236f));
	studentList.add(new Student(2,"supi",99.256f));
	studentList.add(new Student(3,"laddu",94.236f));
	studentList.add(new Student(4,"sudheshana",92.26f));
	studentList.add(new Student(5,"pavani",97.226f));
	List<Float> studentcgpalist=new ArrayList<Float>();
	for(Student stu:studentList)
	{
		if(stu.cgpa<99f)
		{
			studentcgpalist.add(stu.cgpa);	
		}
	}
	System.err.println(studentcgpalist);
}
}



public class constructor_with_param_student {
	int reg_no;
	String name;
	String stream;
	//Constructor.
	constructor_with_param_student(int reg, String name1, String stream1)
	{
		reg_no=reg;
		name=name1;
		stream=stream1;
		System.out.println("In the constructor with arguments of student..and the data is " + reg_no + " " + name + " " + stream);
	}	
	public static void main (String args[])
	{
		constructor_with_param_student student_1 = new constructor_with_param_student(10, "Rohit", "CS");	}}
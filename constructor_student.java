

public class constructor_student {
	int reg_no;
	String name;
	String stream;

	//Constructor.
	constructor_student()
	{
		reg_no=0;
		name="";
		stream="";

		System.out.println("In the constructor of student..");
	}	

	public static void main (String args[])
	{
		constructor_student student_1 = new constructor_student();
	}	
}
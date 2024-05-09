public class student {
	int reg_no;
	String name;
	String stream;
	void Study(String name)
	{
		System.out.println(name + " is studying " );
	}

	void WriteExams(String name)
	{
		System.out.println(name + " is Writing exams ");
	}

	void AttendClasses(String name)
	{
		System.out.println(name + " is Attending classes ");
	}

	void WriteAssignments(String name)
	{
		System.out.println(name + " is Writing Assignments.. ");
	}

	public static void main (String args[])
	{
		student s1 = new student();
		s1.reg_no= 1;
		s1.name = "Charan";
		s1.stream = "Computer science";
		
		s1.AttendClasses(s1.name);
		s1.Study(s1.name);
		s1.WriteAssignments(s1.name);
		s1.WriteExams(s1.name);


	}

}

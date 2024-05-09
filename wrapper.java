
public class wrapper {
	
	public static void main(String[] args) {
		Integer int_obj = 600;
		
		int int_var = int_obj;
		
		System.out.println(int_obj);
		System.out.println(int_var);
		
		int_var = 700;
		int_obj = int_var;
		
		System.out.println(int_obj);
		
	}

}

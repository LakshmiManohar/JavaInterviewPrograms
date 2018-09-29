package interviewPrograms;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "World";
		
		a = a.concat(b);
		b = a.substring(0,5);
		a = a.substring(5);
		
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}

}

package interviewPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=141, rev =0, check;
		
		check = n;
		while(n!=0) {
			
			rev = rev*10+n%10;
			n = n/10;
	}
		if(check==rev) {
			
			System.out.println("This is a Palindrome: "+rev);
		}else {
			
			System.out.println("This is not a Palindrome: "+rev);
		}

	}

}

package interviewPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =1024, r=0;
		
		while(n!=0) {
			
			r = r*10+n%10;
			n = n/10;
			
		}
		
		System.out.println(r);

	}

}

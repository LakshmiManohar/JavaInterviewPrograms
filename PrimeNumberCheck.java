package interviewPrograms;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =97;
		
		int counter =0;
		
		for(int i=n;i>=1;i--) {
			
			if(n%i==0) {
				
				counter = counter+1;
			}
		}
		
		if(counter==2) {
			
			System.out.println("The number is Prime:"+n);
		}else {
			
			System.out.println("This number is not prime:"+n);
		}
		
		

	}

}

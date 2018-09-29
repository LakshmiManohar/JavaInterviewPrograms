package interviewPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =100;
		
		String primeNumber = " ";
		
		for(int i=1;i<=n;i++) {
			
			int counter =0;
			
			for(int j=i;j>=1;j--) {
				
				if(i%j==0) {
					
					counter = counter+1;
				}
			}
			
			if(counter==2) {
				
				primeNumber = primeNumber+i+" ";
			}
		}
		
		System.out.print(primeNumber);
	}

}

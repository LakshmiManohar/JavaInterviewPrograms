package interviewPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 371,temp,a,arm=0;
		temp =n;
		while(n!=0){
			
			a = n%10;
			n = n/10;
			arm = arm+(a*a*a);
	}
		
		if(temp==arm) {
			
			System.out.println("This is an ArmStrong Number: "+arm);
		}else {
			
			System.out.println("This is not an ArmStrong Number: "+arm);
		}
		

	}

}

package interviewPrograms;

public class MobileNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mobile= "9777777777";
		
		if(mobileNumberCheck(mobile)&&(mobile.length()==10)) {
			
			System.out.println("Mobile Number is Valid");
			
		}else {
			
			System.out.println("Invalid Mobile Number");
		}
		
  }
	
	static boolean mobileNumberCheck(String s) {
		
		try {
			
			Long.parseLong(s);
			
			
		}catch(Exception e) {
			
			return false;	
		}
		
		return true;
	}

}

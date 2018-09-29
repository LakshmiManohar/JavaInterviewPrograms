package interviewPrograms;

public class StringReverse {
	
	static String s = "Google at working am i";

	static String ss = "elgooG ta gnikrow ma I"; 

	static String sss = "i ma gnikrow ta elgooG";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		m2();
		m3();

	}
	
	static void m2() {
		
		String [] s1 = s.split(" ");
		System.out.println();
		for(int i=s1.length-1;i>=0;i--) {
			
			System.out.print(s1[i]+" ");
		}
		
		
	}
	
	static void m3() {
		
		String [] sss1 = sss.split(" ");
		System.out.println();
		for(int i=0;i<sss1.length;i++) {
			
			System.out.print(" ");
			
			for(int j=sss1[i].length()-1;j>=0;j--) {
				
				System.out.print(sss1[i].charAt(j));
			}
		}
		
	}
	
	
	static void m1() {
		
		for(int i=ss.length()-1;i>=0;i--) {
			
			System.out.print(ss.charAt(i));
		}
		
	}

}

package interviewPrograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram("peek","keep");
		Anagram("Tom","Jhon");
		
	}
	
	static void Anagram(String s1,String s2) {
	
		String copyOfS1= s1.replace("\\s","");
		String copyOfS2 = s2.replace("\\s","");
		
		boolean status = false;
		
		if(copyOfS1.length()!=copyOfS2.length()) {
			
			status = false;
		}else {
			
			char [] c1 = copyOfS1.toLowerCase().toCharArray();
			char [] c2 = copyOfS2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
	}
		if(status) {
			
			System.out.println(s1+"---------->"+s2+" This is an Anagram");
		}else {
			
			System.out.println(s1+"---------->"+s2+" This is not an Anagram");
		}
  }
}

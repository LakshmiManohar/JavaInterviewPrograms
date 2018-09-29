package interviewPrograms;

import java.util.HashMap;

public class LetterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "PegaSystems";
		
		char [] c = s.toCharArray();
		
		HashMap<Character,Integer> mapCount = new HashMap<Character,Integer>();
		
		for(char cc:c) {
			
			if(mapCount.containsKey(cc)) {
				
				mapCount.put(cc,mapCount.get(cc)+1);
			}else {
				
				mapCount.put(cc,1);
			}
			
		}
		
		System.out.println(mapCount);

	}

}

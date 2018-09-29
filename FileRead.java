package interviewPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	
	public static void main(String args[])  {
		
		
		BufferedReader br = null;
		
		try {
		
		FileReader f = new FileReader("C:\\Users\\Manohar\\Desktop\\hackrank2.txt");
		
		br = new BufferedReader(f);
		

		 int lines=0;
		 int words=0;
		int  characters=0;
		
		
			String currentLine = br.readLine();
			while(br.readLine()!=null) {
				lines++;
				String [] word = currentLine.split(" ");
				words = words+word.length;
				for(String cc:word) {
					
					characters = characters+cc.length();
					
				}
				
				br.readLine();
				
				
				
			}
			System.out.println("Total Lines: "+lines);
			System.out.println("Total words: "+words);
			System.out.println("Total characters: "+characters);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed");
		}
		finally {
			
			try {
				br.close();
				System.out.println("close");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

}

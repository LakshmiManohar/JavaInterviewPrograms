package interviewPrograms;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,3,4,2,5,7,2,3,9,410,11,4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if((arr[i]==arr[j])&&(i!=j)) {
					
					System.out.println("Duplicate Elements are: "+arr[j]);
				}
			}
		}
		
	}

}

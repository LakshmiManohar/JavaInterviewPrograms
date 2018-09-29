package interviewPrograms;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int flag = 0;
		int count = 0;
		int arr[] = {1,3,1,5,3,4,7,8,4,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(i!=j) {
					
					if(arr[i]!=arr[j]) {
					flag=1;	
				   }else {
					   
					   flag=0;
					   break;
				   }
				}
			
			}
			
			if(flag==1) {
				
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("The total count: "+count);
	}

}

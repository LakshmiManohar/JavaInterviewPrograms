package interviewPrograms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of digits to insert");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the integer");
		arr[i] = sc.nextInt();

	}
	
	int first =0;
	int last = arr.length-1;
	System.out.println("Enter the Key element to search:");
	int k =  sc.nextInt();
	binarySearch(first,last,k,arr);
}
	static void binarySearch(int first,int last,int k,int a[])
	{
		int mid = (first+last)/2;
		
		while(first<=last) {
			
			if(a[mid]<k) {
				
				first = mid+1;
				
			}else if(a[mid]==k) {
				
				System.out.println("Element "+a[mid]+" is found in the Position: "+mid);
				break;
			}else {
				
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		
		if(first>last) {
			
			System.out.println("Element not found in the List");
		}
		
		
		
	}

}

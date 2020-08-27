
public class SecondLargest {
public static void secondLargest(int arr[]) {
	int ln=arr.length;
	if(ln<2) {
		      System.out.println("please enter atleast two integer");
	           return ;
	       }
	int first,second;
	first=second=Integer.MIN_VALUE;
	
		for(int i=0;i<ln;i++) {
			
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first) 
				second=arr[i];
		}		
			 if (second == Integer.MIN_VALUE) 
		            System.out.print("There is no second largest element"); 
		        else
		            System.out.print("The second largest element"
		                             + " is " + second); 
		
	}
	
			


	public static void main(String[] args) {
		
		secondLargest(new int[] {5,4,6});

	}

}

package hackerrank_solution;


import java.util.List;
import java.util.Scanner;

public class Simple_array_sum {
	
	  public static int simpleArraySum(List<Integer> ar) {
		  
		return 0;
		    // Write your code here
		    
		    }
	

	
	public static void print_array(int [] data)
	{
		System.out.printf("[");
		for (int i = 0; i < data.length-1; i++)
		{
			System.out.printf("%d, ", data[i]);
		}
		
		System.out.printf("%d]\n", data[data.length-1]);

	}
		 

	
	public static void main(String[] args) {
		int k = 0;
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=scanner.nextInt();
			k=k+arr[i];
			
		}
		System.out.println(k);
		print_array(arr);
	}

	
    

}


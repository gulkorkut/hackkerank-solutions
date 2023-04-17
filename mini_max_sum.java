package hackerrank_solution;

import java.util.Arrays;
import java.util.Scanner;

public class mini_max_sum {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n = 5;
	int min_sum=0;
	int maxx_sum=0;
	int[] A = new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=scanner.nextInt();
		
	}
	Arrays.sort(A); 
	for(int i=0;i<A.length;i++) {
	
		System.out.println(A[i]);
	}
	for(int i=0;i<n-1;i++) {
		min_sum+=A[i];
	}
	for(int j=0;j<=4;j++) {
		maxx_sum=maxx_sum+A[j];
		System.out.println(maxx_sum+ "max");
	}
	System.out.println(A[4]);
	System.out.println(min_sum);
	System.out.println( maxx_sum);
	}

}

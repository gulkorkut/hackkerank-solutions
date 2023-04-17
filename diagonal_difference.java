package hackerrank_solution;

import java.util.Scanner;

public class diagonal_difference {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[][] A=new int[n][n];
		int sum_left=0;
		int sum_right=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				A[i][j]=scanner.nextInt();
			}
		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				
//			System.out.println(A[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<n;i++) {
			sum_left+=A[i][i];
		
		}
		int k=n-1;
		for(int i=0;i<n;i++) {
			
				
				sum_right+=A[i][k];
				k--;
			
		
		}
		
		//System.out.println(sum_left);
		//System.out.println(sum_right);
		System.out.println(Math.abs(sum_left-sum_right));
	}

}

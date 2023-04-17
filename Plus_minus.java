package hackerrank_solution;

import java.util.Scanner;

public class Plus_minus {
	public static void main(String[] args) {
		int plus=0;
		int minus=0;
		int zero=0;
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scanner.nextInt();
			if(A[i]>0) {
				plus++;
				
			}else if(A[i]==0) {
				zero++;
			}else {
				minus++;
			}
			
		}
		float answer=0f;
		answer=(float) plus/n;
		System.out.println(String.format("%.6f", answer));
		answer= (float) minus/n;
		System.out.println(String.format("%.6f", answer));
		answer= (float) zero/n;
		System.out.println(String.format("%.6f", answer));
		
	}

}

package hackerrank_solution;

import java.util.Scanner;

public class a_very_big_sum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] a= new int[n];
		long sum=0;
		
		for(int i = 0;i<n;i++) {
			a[i]=scanner.nextInt();
		sum=sum+a[i];
		}
		System.out.println(sum);
	}

}

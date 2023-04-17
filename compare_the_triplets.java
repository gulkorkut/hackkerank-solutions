package hackerrank_solution;

import java.util.Scanner;

public class compare_the_triplets {
	public static void compare(int[]a,int[]b) {
		int ap=0;
		int bp=0;
		for(int p=0;p<3;p++) {
			if (a[p]<b[p]) {
				
				bp++;
			}else if(a[p]>b[p]) {
				ap++;
			}else {
			
			}
			
		}
		int c[]= new int[2];
	      c[0]= ap;
	      c[1]=bp;
	      System.out.println(ap+" " + bp);
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
		
		Scanner scanner=new Scanner(System.in);
		int[] a= new int[3];
		int[] b=new int[3];
		for(int i = 0;i<3;i++) {
			a[i]=scanner.nextInt();
		
		}
		for(int i = 0;i<3;i++) {
			b[i]=scanner.nextInt();
		
		}
		compare(a, b);
		//print_array(a);
		//print_array(b);
		
	      //print_array(c);
	    
	}

}

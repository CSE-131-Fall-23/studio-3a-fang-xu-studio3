package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many value do you want?");
		int n = in.nextInt();
		
		int[] array = new int[n];
		for (int i=2; i<= n; i++) 
		{
			array[i-2]=i;
			
		}
		
		for(int j=2; j<=Math.sqrt(n); j++ ) 
		{
			for(int i=j+j;i<=40 ;i=i+j) 
			{
				if (array[i-2]==i) 
				{
					array[i-2]=0;
					
				}
				
			}
		}
		
			
		for (int i=2; i<= n-2; i++) 
		{
			
			if (array[i]!=0) 
			{
				System.out.println(array[i]);
			}
		}	
		

	}

}


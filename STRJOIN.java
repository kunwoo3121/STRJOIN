import java.util.Arrays;
import java.util.Scanner;

public class STRJOIN {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int n;
		
		int hap;
		
		int len;
		
		int[] StringSet; 
		
		for(int i = 0; i < c; i++)
		{
			hap = 0;
			
			n = sc.nextInt();
			
			StringSet = new int[n];
			
			len = n;
			
			for(int j = 0; j < n; j++)
			{
				StringSet[j] = sc.nextInt();
			}
			
			Arrays.sort(StringSet);
			
			while(len > 1)
			{
				StringSet[0] = StringSet[0] + StringSet[1];
				
				hap += StringSet[0];
				
				for(int j = 1; j < len - 1; j++)
				{
					StringSet[j] = StringSet[j+1];
				}
				
				len--;
				
				Arrays.sort(StringSet,0,len);
			}
			
			System.out.println(hap);
		}
	}

}

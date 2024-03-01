import java.util.Scanner;
import java.util.Arrays;
class Descending
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();			//getting the size of an array
		int a[]=new int[n];			//declaring array

		System.out.println();
		for(int i=0;i<n;i++)			//getting the input
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n-1;i++)			//sorting in descending
		{
			for(int j=i+1;j<n;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
		}
		System.out.println(Arrays.toString(a));	//printing the array
		
	}
}
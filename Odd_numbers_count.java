import java.util.Scanner;
class Odd_numbers_count
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
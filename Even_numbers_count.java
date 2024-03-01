import java.util.Scanner;
class Even_numbers_count
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n+1;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
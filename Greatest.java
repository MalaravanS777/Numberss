import java.util.Scanner;
class Greatest
{
	public static void main(String[] args)
	{
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]>a[1])
		{
			if(a[0]>a[2])
				System.out.println(a[0]);
			else
				System.out.println(a[2]);
		}
		else
		{
			if(a[1]>a[2])
				System.out.println(a[1]);
			else
				System.out.println(a[2]);
		}
		
	}

}
class multiples_2_3
{
	public static void main(String[] args)
	{
		int n=3;
		while(n<=100)
		{
			if(n%3==0 && n%2==0)
			{
				System.out.print(n+" ");
			}
			n++;
		}
	}
}
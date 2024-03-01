import java.math.BigInteger;
class product_100
{
	public static void main(String[] argm)
	{
		BigInteger multiple=BigInteger.ONE;
		for(int i=2;i<=100;i++)
		{
			multiple=multiple.multiply(BigInteger.valueOf(i));
		}
		System.out.println(multiple);
	}
}
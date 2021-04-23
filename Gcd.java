class Gcd
{
	public Gcd(int m, int n)
	{
		while(n>0)
		{
			int r=m%n;
			m=n;
			n=r;
		}
		System.out.println("GCD = "+m);
	}
	public static void main(String args[])
	{
		System.out.println("Hello India");
		Gcd g=new Gcd(33,77);
		
	}
	
}
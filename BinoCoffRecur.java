class BinoCoffRecur
{
	public static void main(String args[])
	{
		BinoCoffRecur bcr=new BinoCoffRecur();
		System.out.println(bcr.binoCoff(7,4));
	}
	
	public int binoCoff(int n,int k)
	{
		if(k==0)
		{
			return 1;
		}
		if(k==n)
		{
			return 1;
		}
		else
		{
			return binoCoff(n-1,k-1)+binoCoff(n-1,k);
		}
	}
}
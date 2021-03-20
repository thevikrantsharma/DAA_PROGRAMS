class BinoCoffDynamic
{
	public static void main(String args[])
	{
		int arr[][]=new int[8][8];
		
		for(int i=0;i<8;i++)
		{
			arr[i][0]=1;
			arr[i][i]=1;
		}
		
		for(int n=2;n<8;n++)
		{
			for(int k=1;k<n;k++)
			{
				arr[n][k]=arr[n-1][k-1]+arr[n-1][k];
			}
		}
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		
		
	}
}
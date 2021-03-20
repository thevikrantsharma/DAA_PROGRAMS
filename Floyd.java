class Floyd
{
	public static void main(String args[])
	{
		int arr[][]={{0,3,99,7},{8,0,2,99},{5,99,0,1},{2,99,99,0}};
		
		for(int k=0;k<4;k++)
		{
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(i==k || j==k)
					{
						continue;
					}
					if(arr[i][j]>arr[i][k]+arr[k][j])
					{
						arr[i][j]=arr[i][k]+arr[k][j];
					}
				}
		
			}
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println("Hi");
	}
}
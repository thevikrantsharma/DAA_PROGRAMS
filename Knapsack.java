class Knapsack
{
	public static void main(String args[])
	{
		String item[]={"","A","B","C","D"};
		int p[]={0,1,2,5,6};
		int w[]={0,2,3,4,5};
		int v[][]=new int[5][9];
		
		for(int i=1;i<5;i++)
		{
			for(int c=1;c<9;c++)
			{
				if(c-w[i]<0)
				{
					v[i][c]=v[i-1][c];
				}
				else if(v[i-1][c]>p[i]+v[i-1][c-w[i]])
				{
					v[i][c]=v[i-1][c];
				}
				else
				{
					v[i][c]=p[i]+v[i-1][c-w[i]];
				}
			}	
		}
		for(int i=0;i<5;i++)
		{
			for(int c=0;c<9;c++)
			{
				System.out.print(v[i][c]+", ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		System.out.println("ITEMS SELECTED:");
		int pr=v[4][8];
		int y=4;
		int x=8;
		while(pr>0)
		{
		 while(v[y][x]==v[y-1][x])
		 {
			 y=y-1;
		 }
		 System.out.println(item[y]);
		 pr=pr-p[y];
		 while(pr>0 && pr!=v[y][x])
		 {
			x=x-1; 
		 }
		}
	}
}
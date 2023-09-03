package com.kodnest.patterns;

public class Pattern22 {
	 
	public static void main(String []args)
	 {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(" " );
			}
					for( int k=1;k<=i;k++)
		
						{
					
						System.out.print("*" );
					}
		}
		
					for(int l=1;l<=5;l++)
					{
						for(int m=5;m>=l;m--)
						{
							System.out.print(" " );
						}
					
						for(int n=1;n<=5;n++)
						System.out.print("*");
					}
		
					System.out.println(" ");
				
		
}
	 
}



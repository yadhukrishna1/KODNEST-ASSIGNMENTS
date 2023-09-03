package com.kodnest.patterns;

public class Pattern_G {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		
			if((i==1&&j<=n)||( j==1)||(i==n  && j<=n) ||(i==n && j>n && j>=n )||( j>=n/2 && i>=n/2 && i==n/2)
					||(i>=n/2 && j==n))
					
					
					{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
}

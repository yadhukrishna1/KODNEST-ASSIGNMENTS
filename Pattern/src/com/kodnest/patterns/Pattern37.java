package com.kodnest.patterns;

public class Pattern37 {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j>=i;j--)
			{
				System.out.print( " ");
			}
			for(int j=1;j<(i*2);j++)
			{
				if((j>1) && j<(i*2)-1||j==n)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
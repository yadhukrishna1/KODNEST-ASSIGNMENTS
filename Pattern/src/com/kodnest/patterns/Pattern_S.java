package com.kodnest.patterns;

public class Pattern_S {
public static void main(String[] args) {
		
		
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		
	if((j==1 && i<=n/2)||(i==n/2+1)||(i==1)||(i>=n/2+1 && j==n)||(i==n))
					
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

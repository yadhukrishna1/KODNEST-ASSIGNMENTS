package com.kodnest.patterns;

public class Pattern_K {
public static void main(String[] args) {
		
		
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		
	if((j==1)||(i+j == n-3)||(i==j+n/2-1))
					
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

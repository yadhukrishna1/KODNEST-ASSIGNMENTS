package com.kodnest.patterns;

public class Pattern_P {
public static void main(String[] args) {
		
		
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
		
	if((j==0)||(i==0 )||(i<=n/2 && j==n)||(i==n/2 && j<=n) )
					
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
 
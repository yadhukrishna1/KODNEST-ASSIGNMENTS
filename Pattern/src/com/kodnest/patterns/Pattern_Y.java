package com.kodnest.patterns;

public class Pattern_Y {
public static void main(String[] args) {
		
		
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if((i==j&& i<=n/2)||(j>=n/2 && j==n-i-1)||i>=n/2&&j==n/2)
			{
				
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			}
			System.out.println("");
}
}
}

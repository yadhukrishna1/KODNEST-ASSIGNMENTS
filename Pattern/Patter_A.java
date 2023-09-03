package com.kodnest.patterns;

public class Patter_A {
public static void main(String[] args) {
		
		
		int n=20;
		int fp=n/2;
		int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			for( int j=1;j<=n;j++)
			{
		
				//if((i==j && j>=n/2+2)||(j<=n/2 && j==n-i)||i==9 && j<=8 && j>=3)
					if( j==sp+1||j==fp||i==n/2-5 && j>5 && j<=15)	
				{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}
		System.out.println();

		fp--;
		sp++;
	}
	}
}

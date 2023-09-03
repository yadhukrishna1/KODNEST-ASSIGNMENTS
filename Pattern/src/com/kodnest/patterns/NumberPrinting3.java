package com.kodnest.patterns;

public class NumberPrinting3 {
	public static void main(String []args)
	 {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j );
			}
		
			System.out.println("");
		}
}
}

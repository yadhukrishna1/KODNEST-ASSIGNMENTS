package com.kodnest.patterns;

public class Pattern_B2 {
	public static void main(String[] args) {
		
	
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=8;j++)
		{
	
if(j==1||(i==10||i==10/2||i==1)&& j%2==1||j==8 && i!=1&& i!=10/2 && i!=10 )
			//if(j==1||(i==10||i==1)&& j%2==1||j==8 && i!=1 && i!=10 )	
				
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

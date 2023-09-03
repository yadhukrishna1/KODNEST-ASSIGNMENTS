package com.kodnest.patterns;

public class BoxTwo {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		
			if(j==1&&i<=n/2||(i==1&&j<=n/2||i==n/2&&j<=n/2||j==n/2&&i<=n/2||i==6&&j>=n/2+1)||(j==6&& i>n/2+1)||(j>n/2 && i==n)||(i>n/2 && j==n) ) {
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

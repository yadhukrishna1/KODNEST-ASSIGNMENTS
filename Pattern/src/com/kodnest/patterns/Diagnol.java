package com.kodnest.patterns;

public class Diagnol {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			//if(i==5||i==1||j==1||j==5||i==j||(i+j)==(5+1))
				if(i==j||(i+j)==(5+1))
			{
				
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			}
			System.out.println(" ");
		}
	}
}

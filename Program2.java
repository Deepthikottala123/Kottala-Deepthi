package tandemloop_projects;

import java.util.Scanner;

public class Program2 
{
	public static void series(int x)
	{
		int a=1;
		for(int i=1;i<=x;i++)
		{
			if(i<x)
				System.out.print(a+",");
			else
				System.out.println(a);
			a+=2;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Series");
		int x= sc.nextInt();
		series(x);
	}
}

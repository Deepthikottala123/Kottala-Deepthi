import java.util.Scanner;

public class Program1 
{
	public static void calculate(double a,double b,String str)
	{
		switch(str.toLowerCase())
		{
		case "addition" :
			System.out.println("The "+str+" of "+a+" & "+b+" is "+(a+b));
			break;
		case "subtraction" :
				System.out.println("The "+str+" of "+a+" & "+b+" is "+(a-b));
				break;
		case "multiplication" :
			System.out.println("The "+str+" of "+a+" & "+b+" is "+(a*b));
			break;
		case "division" :
			if(b!=0)
			{
				System.out.println("The "+str+" of "+a+" & "+b+" is "+(a/b));
				break;
			}
			else
			{
				System.out.println("Cannot divide a number by zero");
				break;
			}
		default :
			System.out.println("Invalid operation");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value(double)");
		double a =sc.nextDouble();
		System.out.println("Enter the b value(double)");
		double b = sc.nextDouble();
		System.out.println("Select the Operation");
		System.out.println("Addition");
		System.out.println("Substraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		String str = sc.next();
		calculate(a,b,str);
		
	}
}

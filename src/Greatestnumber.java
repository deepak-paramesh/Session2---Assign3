import java.util.Scanner;

class Greatestnumber
{
	static int a,b,c;
	static int largest;
	
	static void input(){
		System.out.println("Enter any three numbers: ");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	public static void main(String[] args) 
	
	{	
		Greatestnumber obj = new Greatestnumber();
		Greatestnumber.input();
		obj.largestNumber();
		obj.ternaryOperators();
		
	}
	
	public void largestNumber(){
		
		if(a>=b && a>=c) 
		{
			System.out.println("Largest number: "+a);
		}
		if(b>=a && b>=c) 
		{
			System.out.println("Largest number: "+b);
		}
		if(c>=a && c>=b) 
		{
			System.out.println("Largest number: "+c);
		}
	}
	
	
	public void ternaryOperators(){
		
		largest=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest Number using ternary operator is : " +largest);
		//System.out.println("Largest number: "+largest);
		
	}
}
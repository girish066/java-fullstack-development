package demo;

public class Type 
{
	public static void main(String[] args)
	{
		System.out.println("implicit type casting");
		char a='C';
		System.out.println("value of a:"+a);
		int b=a;
		System.out.println("value of b:"+b);
		float c=a;
		System.out.println("value of c:"+c);
		long d=a;
		System.out.println("value of d:"+d);
		double e=a;
		System.out.println("value of e:"+e);
		
		System.out.println("\n");
        
		System.out.println("explicit type casting");
		double x=90;
		int y=(int) x;
		float z=(float) x;
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
		System.out.println("value of z:"+z);
		
	}	
}

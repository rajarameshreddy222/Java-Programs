package project1;
import java.util.Scanner;
public class ArthematicOpertions
{int c;
	public void add(int a ,int d )
	{
		c=a+d;
		System.out.println("add is "+c);
	}
	public void sub(int a,int d)
	{
		c=a-d;
		System.out.println("sub is "+c);
	}
	public void mul(int a,int d)
	{
		c=a*d;
		System.out.println("mul is "+c);
	}
	public void div(int a,int d)
	{
		c=a/d;
		System.out.println("div is "+c);
	}

	public static void main(String[] q) 
	{
		Scanner s=new Scanner(System.in);
	
	    
		System.out.println("enter a value");
          int a=s.nextInt();
          System.out.println("enterd value");
          int d=s.nextInt();
          
		 ArthematicOpertions obj= new ArthematicOpertions();
		 obj.add(a,d);
		 obj.sub(a,d);
		 obj.mul(a,d);
		 obj.div(a,d);

	}

}

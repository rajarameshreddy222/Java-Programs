package project1;
import java.util.Scanner;
public class Printenotes 
{
	
	public static void main(String[] args)
	{ int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter amout");
		int amt=s.nextInt();
		if(amt%100==0)
		{
			if(amt>=2000) 
		
		{
			a=amt/2000;
			amt=amt-(a*2000);
			System.out.println("2000 :"+a);	
		}
			if(amt>=500) 
				
			{
				b=amt/500;
				amt=amt-(b*500);
				System.out.println("500 :"+b);
			}
           if(amt>=100) 
				
			{
				c=amt/100;
				amt=amt-(c*100);
				System.out.println("100 :"+c);
			}}
		else
		{
			System.out.println("not vaild");
		}
	}

}

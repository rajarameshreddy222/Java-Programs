package project1;

import java.util.Scanner;

public class ArmstrongInFunction {
	
	public void armstrong()
	{
	   int n,i=1,temp,sum=0,digits=0,rem;
	   System.out.println("Enter number to print all armstrong numbers till a given number");
	   Scanner s=new Scanner(System.in);
		n=s.nextInt();
	   while(i<=n)
	   {
	   
	   temp=i;
	   while(i!=0)
	   {
	   	  i=i/10;
	   	  digits++;
	   }
	   i=temp;
	   while(i!=0)
	   {
	   	    rem=i%10;
	   	    sum+=Math.pow(rem,digits);
	   	    i=i/10;
	   }
	   digits=0;
	     i=temp;
	   if(temp==sum)
	   {
	   System.out.println(i+"\t");
	   }
	    sum=0;

	   i++;
	}
	}
	
	

	public static void main(String[] args) 
	{
		ArmstrongInFunction obj=new ArmstrongInFunction();
		obj.armstrong();
	
	}

}

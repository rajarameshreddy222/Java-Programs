package project1;

import java.util.Scanner;

public class Prime_And_Prefect_In_Menu {
	int i;
	public void prime(int n)
	{
		int fc=0;
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				fc++;
				
			}
		}
		if(fc==1)
		{
			System.out.println("is prime no ");
		}
		else
		{
			System.out.println("is not prime no ");
		}		
		
	}
	public void perfect(int n)
	{int sum=0;
		for(i=1;i<=n/2;i++)
	
	     {
		if(n%i==0)
		  {
			sum+=i;
		  }
	     }
		if(sum==n)
		{
			System.out.println("is perfect no ");
		}
		
		else
		{
			System.out.println("is not  perfect no ");
		}
	}
	public void Armstrong(int n)
	{
		int sum=0,digits=0;
		for(i=1;i<n/2;i++)
		{
			if(n%i==0)
			{
				digits++;
			}
		}
		
		
	}
	public void viewoperations()
	{
		int n,opt=0;
	
		   Scanner s=new Scanner(System.in);
		System.out.println("1.prime no ");
		System.out.println("2.perfect  no ");
		do {
		System.out.println("enter options between 1-2 ");
		 opt=s.nextInt();
		
	if(opt==1)
	{	
		System.out.println("enter number to check prime or not");
		n=s.nextInt();
		prime(n);
	  }
	if (opt==2)
	{
		System.out.println("enter number to check perfect or not");
		n=s.nextInt();
		 perfect( n);
	}
		}
	while(opt!=0);
		}
	
	public static void main(String[] args)
	
	{
	
		Prime_And_Prefect_In_Menu obj=new Prime_And_Prefect_In_Menu();
		obj.viewoperations();
		
	}

}

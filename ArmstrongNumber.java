import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{int fc=0,sum=0,temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter no ");
	int num=s.nextInt();
	temp=num;
	while(num!=0)
		{
		num=num/10;
	      fc++;
	    }
		num=temp;
		while(num!=0)
		{
       sum+=Math.pow(num%10,fc);
		   num=num/10;
	   }
	   num=temp;
	   if(sum==temp)
		   System.out.println("Is armstrong "+ sum);
        else
        System.out.println(" Is not armstrong "+ sum);
	}

}
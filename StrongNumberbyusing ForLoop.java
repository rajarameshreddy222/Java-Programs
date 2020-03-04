import java.util.Scanner;
class Strongnumber
{
	public static void main(String [] args)
	{
	int n,sum=0,rem,i=1,fact=1,temp,j=1;
	System.out.println("Enter number to print strong number till n");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(j=1;j<=n;j++)
{	
   temp=j;
	while(j!=0)
	{
	    	rem=j%10;
	    for(i=1;i<=rem;i++)
	    	{
			fact=fact*i; 
	         }
	         sum=sum+fact;
	         fact=1;
	         j=j/10;
	}
	j=temp;
    if(temp==sum)
	{
		System.out.println(j+"is strong");
	}
	else 
			{
		System.out.println(j+"is not strong");
	}
sum=0;
 
}
}
};
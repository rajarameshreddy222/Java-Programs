import java.util.Scanner;
class  strong
{
	public static void main(String[] args) 
	{
		int sum=0,fc=1,temp,rem;
		Scanner s=new Scanner(System.in);
	System.out.println("enter no ");
	int num=s.nextInt();
	temp=num;
		while(num!=0)
		{  rem=num%10;
			while(rem>=1)
		   {
			fc=fc*num/10;
			}
		
			sum+=fc;
			fc=1;
			num=num/10;
		}
		if(sum==temp)
		System.out.println("is strong no "+ sum);
		else
		System.out.println("is not strong no "+ sum);
	}
}

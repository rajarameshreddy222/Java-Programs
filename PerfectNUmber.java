import java.util.Scanner;
class PerfectNumber

{
	public static void main(String[] args) 
	{
		int sum=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no ");
		int num=s.nextInt();
		for(i=1;i<=num/2;i++)
			if(num%i==0)
			 sum+=i;
			if(sum==num)
	    System.out.println(num+"is perfect ");	
			else	
         System.out.println(num+"is not  perfect ");

				
	}
}

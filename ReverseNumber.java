import java.util.Scanner;
class reverseno 
{
	public static void main(String[] args) 
	{int rev=0;
	Scanner s=new Scanner(System.in);
		System.out.println("enter no ");
		int num=s.nextInt();
		while(num!=0){
		rev=rev*10+num%10;
		num=num/10;}
		System.out.println("Is reverse no"+" "+rev);
		
	}
}

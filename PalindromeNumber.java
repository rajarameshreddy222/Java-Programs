import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{int rev=0,temp;
	Scanner s=new Scanner(System.in);
		System.out.println("enter no ");
		int num=s.nextInt();
		temp=num;
		while(num!=0){
		rev=rev*10+num%10;
		num=num/10;}
		if(rev==temp)
		System.out.println("Is palindrome no"+" "+rev);
		else 
		System.out.println("Is  not palindrome no"+" "+rev);
	}
}

package project1;
import java.util.Scanner;
public class String_In_Reverse

{
	public static void main(String[] args)
	{ 
		int i = 0;
		Scanner s=new Scanner(System.in);
		System.out.println(" enter string");
		String str=s.nextLine();
		System.out.println(str.length());
		for( i=(str.length()-1);i>=0;i--)
		{
		System.out.print(str.charAt(i));
		}
		}
	}



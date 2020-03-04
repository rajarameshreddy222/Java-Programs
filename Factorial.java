package project1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value");
		int num=s.nextInt();
		while(num>=1)
		{
			
			fact=fact*num;
			num--;
		}
		System.out.println("factorial "+fact);
	}

}

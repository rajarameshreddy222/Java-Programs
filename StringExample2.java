package project1;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args)
	{
	
	      String str;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter string ");
          str=s.nextLine();
          
        System.out.println(str.length());
        System.out.println(str.startsWith("hai"));
        System.out.println(str.endsWith("."));
        System.out.println(str.endsWith("thank you"));
	}

}

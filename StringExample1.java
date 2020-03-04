package project1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
         System.out.println("Enter string ");
         String str=s.nextLine();
         
         System.out.println(str.toUpperCase());
         System.out.println(str.toLowerCase());
         System.out.println(str.contains("hai"));          
         System.out.println(str.equals("hai hello"));
         System.out.println(str.equalsIgnoreCase("hai hello"));
 
	}

}

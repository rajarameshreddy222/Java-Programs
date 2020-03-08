package project1;

import java.util.Scanner;

public class MinWordlLength {

		public static void main(String[] args) 
		{
		int word=0,min=0;
		System.out.println("Enter a string to find maximum characters");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(min>words[i].length())
			{
				min=words[i].length();
				word=i;
			}
		}
		
		System.out.println(words[word]+"  "+words[word].length());
		
	}

}
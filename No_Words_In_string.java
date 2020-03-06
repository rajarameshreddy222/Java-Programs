package project1;
import java.util.Scanner;
public class No_Words_In_string {
 
	
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
	    String words[]=str.split(" ");
	    System.out.println(words.length);
	    for(int i=0;i<words.length ;i++)
	    {
	    System.out.println(words[i]);
	    }

	    
	}
}

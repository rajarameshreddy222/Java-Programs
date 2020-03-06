package project1;
import java.util.Scanner;
public class SearchFrequency 
{
	public static void main(String[] args) {
	int i=0,Search,count=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println(" enter string");
		String str=s.nextLine();
		System.out.println(str);
		String words[]=str.split(" ");	
		System.out.println(" enter search element");
		String search=s.next();
		
		for( i=0;i<words.length;i++)
		{ 
		if(search.equals(words[i]))
			{
			count++; 
			}
		}
		System.out.println("Frequency "+count);
	}
}

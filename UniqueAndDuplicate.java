package project1;

import java.util.Scanner;

public class UniqueAndDuplicate {
	public void unique(String words[] )
	{ int count=1;
		for( int i=0;i<words.length;i++)
		{ 
			for(int j=i+1;j<words.length;j++)	
			{
				if(words[i].equals(words[j]))
				{
			  count++;
		      }}
		if(count==1)
		{	System.out.println(" unquie words "+ words[i]);
			}
		count=1;
		}}
public void Duplicate(String words[])
{int count=1;
		for(int i=0;i<words.length;i++)
		{
			for (int j=i+1;j<words.length;j++)
			{
				if (words[i].equals(words[j]))
				{
					count++;
				}
			}
		   if(count>1)	
		   {
			   System.out.println("duplicate words :"+words[i]);
		   }
		   count=1;
		}
}
public void display(String words[])
{
	for(int i=0;i<words.length;i++)
	{
		System.out.println(words[i]);
	}
}

	

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println(" enter string");
		String str=s.nextLine();
		System.out.println(str);
		String words[]=str.split(" ");	
		UniqueAndDuplicate ud=new UniqueAndDuplicate();
		 ud.unique(words);
		 ud.Duplicate(words);
		 ud.display(words);
		 
	}

}

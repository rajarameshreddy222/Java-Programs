import java.util.Scanner;
public class Programs_On_Strings

{
	Scanner s =new Scanner (System.in);
	
public 	void maxOccurance(String str)
	{
		int count=0,max=0;
		
		char ch[] =str.toCharArray();
		char result=' ';

for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{

if(str.charAt(i)==str.charAt(j))
{
count++;
if(max<count)
{
max=count;
result=str.charAt(i);

}
}}
}
System.out.println("Maximum occured character is:"+result);
}
	

	public void duplicate(String str)
	{
		
}
     
	
	public void longestWord(String str)
	{int i;
		String words[]=str.split(" "); 
		int max=0,r=0;
		for( i=0;i<words.length;i++)
		{
			if(max<words[i].length())
			{
				max=words[i].length();
				r=i;
			}
		}
		System.out.println(words[r]+"  "+words[r].length());
	}
	
	


	public static void main(String[] args)
	{
	
		Scanner s= new  Scanner (System.in);
		System.out.println("enter string ");
		String str=s.nextLine();
		System.out.println(str);
		Programs_On_Strings obj=new Programs_On_Strings();
	    obj.longestWord(str);
		obj.maxOccurance(str);
		obj.duplicate(str);
	

	}

}

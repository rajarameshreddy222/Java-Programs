import java.util.Scanner;
public class First_Non_Repeated_Char_In_String
{

    public void non_Repeated_Char(String str)
    {
    	int char_count=1;
    	char ch[]=str.toCharArray();
  
    	for(int i=0;i<ch.length;i++)
    	{
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{

    				char_count++;
    			}
    		}
    		if(char_count==1)
    		{
    			System.out.println("first non repeated character in string is   "+ch[i]+"   "+char_count);
    			break;
    		}
    		char_count=1;
    	}
    }
    
    
	public static void main(String[] args)
	{
       First_Non_Repeated_Char_In_String f=new First_Non_Repeated_Char_In_String();
       Scanner s=new Scanner(System.in); 
       System.out.println("enter string");
       String str=s.nextLine();
       f.non_Repeated_Char(str);
	}


}

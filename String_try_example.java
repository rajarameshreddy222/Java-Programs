package project1;

public class String_try_example {

	public static void main(String args[])
	{
		System.out.println("line 1");
        try {     
		System.out.println(10/0);
        }
        catch(Exception e)
        {
        	System.out.println("alternate code or error ");
        }
             System.out.println("line 2");
             System.out.println("line 3");
	}
		

	
}

package project1;
import java.util.Scanner;
public class Array_asc_and_desc_order {
	
	public void ascOrder()
	{
		int n,j,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		n=s.nextInt();
		System.out.println("enter "+n+"value");
		int arr[]=new  int[n];
		for(int i=0;i<n;i++)
			{
			arr[i]=s.nextInt();
			}
	    for(int i=0;i<n;i++)
			{
     for(j=i+1;j<n;j++) 
         {
    	 if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
           }
	     }}
     for(int i=0;i<n;i++)
     {
    	 System.out.println( arr[i]+" \t " );
 	 }
			 }
			
	
	public void descOrder()
		{
			int n,j,temp;
			Scanner s=new Scanner(System.in);
			System.out.println("enter n value");
			n=s.nextInt();
			System.out.println("enter "+n+"value");
			int arr[]=new  int[n];
			for(int i=0;i<n;i++)
				{
				arr[i]=s.nextInt();
				}
		    for(int i=0;i<n;i++)
				{
	     for(j=i+1;j<n;j++) 
	         {
	    	 if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	           }
		     }}
		    for(int i=0;i<n;i++)
		     {
		    	 System.out.println( arr[i]+" \t " );
		 	 }
				}
	
	public static void main(String[] args)
	{
		Array_asc_and_desc_order obj=new Array_asc_and_desc_order();	
       obj.ascOrder();
       obj.descOrder();
	}

}

package project1;

import java.util.Scanner;

public class LinearSearch {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j,size,search=0;
		int flag=0;
		System.out.println("enter size   value");
		 size=s.nextInt();
		System.out.println("enter "+size+"  value");
		int arr[]=new  int[100];
		for( i=0;i<size;i++)
		{
		arr[i]=s.nextInt();
		}
		System.out.println("enter search element");
		search=s.nextInt();
	
		for(i=0;i<size;i++)
	 
	    {
			if(search==arr[i])
			{
			flag++;
			;
			}}
		if(flag>1)
		System.out.println("fre  :"+flag);
		else
		System.out.println("is not present");
		
		
}
}

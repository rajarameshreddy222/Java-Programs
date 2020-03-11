package project1;
import java.util.Scanner;
public class Queue_In_Array
{ 
int i,size,value = 0,front=-1;
int arr[]=new int[100];
Scanner s=new Scanner(System.in);
public Queue_In_Array() 
{
           System.out.println("Enter queue size");
           size=s.nextInt();
           
}
	public void first_In(int value )
	{
		
		if(front==size-1)
		{
			System.out.println("queue is full");
		}
		else
		{
			front++;
			arr[front]=value;	
		}
		
	}
	public void first_Out()
	{
		for(i=0;i<=front;i++)
		{
			arr[i]=arr[i+1];
		}
		front--;
			
	}
	public void display(int size)
	{ 
		for (i=0;i<=size;i++)
		{ 
			System.out.print(arr[i]+" \t ");	
		}
	
	}
	
	public void viewOptions()
	{
		int opt=0;
		System.out.println("1. Insert");
		System.out.println("2. delete");
	
		do {
			System.out.println("\nenter 1 or 2");
		 opt=s.nextInt();
		if(opt==1)
		{
			System.out.println("Enter value to insert");
			value=s.nextInt();
			first_In(value);
			display(front);
		}
		else if(opt==2)
		{
			first_Out();
		     display(front);
		}}
		while(opt!=0);
		
	}
	public static void main(String[] args)
	   { 
		Queue_In_Array obj=new Queue_In_Array();
		obj.viewOptions();
		}

}

package project1;

import java.util.Scanner;

public class Queue_Normal {

	public static void main(String[] args) {
		
           int i, front=-1;
	       int arr[]=new int[6];
		Scanner s=new Scanner(System.in);
		for (i=front;i<=5;i++)
	       {
			System.out.println("enter value");
			int value1=s.nextInt();
			
			if(front==6-1)
			{
				System.out.println("queue is full");
			}
			else
			{
				front++;
				arr[front]=value1;	
			}
			
	       }
	for (i=0;i<=5;i++)
	       {
	System.out.print(arr[i]+" \t ");	
	        }

	    }
	}



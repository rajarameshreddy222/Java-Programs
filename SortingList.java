package project1;

import java.util.Scanner;
public class SortingList
{
	int i,j,n,temp,key,min,l;
	static int arr[]= {3,2,1,4,5,6,8};
	public void Bubble()
	{
	for(i=0;i<7-1;i++)
	{
		for(j=0;j<7-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}	
	}
	}
	public void selection()
	{
		for(i=0;i<7-1;i++)
		{
			min=arr[i];
			for(j=i+1;j<7-1;j++) 
			{
				if (min<arr[j])
				{
				 temp=arr[i];
				 arr[i]=min;
				 min=temp;
			    }
				}
		}
		
	}
	public void insertion()
	{
		for(i=0;i<7-1;i++)
		{
			key=arr[i];
			j=i-1;
			while(j>=0 && key<arr[i])
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			j++;
		}
		arr[j+1]=key;
	}
public int partition(int start,int end )
{
	
	int i,
	j=start;
	int pivot=arr[end];
	for(i=start;i<end;i++)
	{
		if(pivot>arr[i])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
	}
	temp=arr[j];
	arr[j]=arr[end];
	arr[end]=temp;
	return j ;
}
public void quicksort(int start,int end)
{
	if(start<end)
	{
	int index=partition(start,end);
	quicksort(start,index-1);
	quicksort(index+1,end);
	}}
	
	
	
	
	public void display()
	{
		for(i=0;i<7;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	

	public static void main(String[] args)
	{
		SortingList obj=new SortingList();
		obj.Bubble();
		obj.display();
		obj.selection();
		obj.display();
	    obj.selection();
	    obj.display();
	    obj.quicksort( 0, 6);
	    obj.display();
	    
	}

}

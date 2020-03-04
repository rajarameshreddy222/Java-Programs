import java.util.Scanner;
class Array
{
	public static void main(String[] args) 
	{ 
		int n;
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
System.out.print(arr[i]+"\t");
}



		

	}
}

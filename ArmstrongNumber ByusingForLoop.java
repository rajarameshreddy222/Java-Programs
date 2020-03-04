import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args)
	{int fc=0,sum=0,i=1,j=1;
	int temp;
	Scanner s=new Scanner(System.in);
	System.out.println("enter no ");
 int n=s.nextInt();

 for(i=1;i<=n;i++)
		{
		temp=i;
        while(i!=0)
	   {
		i=i/10;
	      fc++;
	    }
		i=temp;	
	    while(i!=0)
		    {
       sum+=Math.pow((i%10),fc);
		   i=i/10;
	        }
			fc=0; 
			i=temp;
			if(sum==i){
		   System.out.println(" \t "+ i); 
		   }
      sum=0;
		}

}
}
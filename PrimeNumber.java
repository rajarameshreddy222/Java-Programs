class primeno 
{
	public static void main(String[] args) 
	{ int i,n=13,fc=0;
	for(i=1;i<=n/2;i++)
		{
		if(n%i==0)
			fc++;
		}
		if(fc==1)
		System.out.println(n+"is prime no");
		else
		System.out.println(n+"is not prime no");
	}
}

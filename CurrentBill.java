package project1;
import java.util.Scanner;
public class CurrentBill 
{
	
	public static void main(String[] args)
	{ double bill;
		Scanner s=new Scanner(System.in);
		System.out.println("enter units");
		int units=s.nextInt();
		if(units<=50)
		{
			bill=units*0.50;
		}
		else if(units<=150)
		{
			bill=(50*0.50)+(units-50)*0.75;
		}
		else if(units<=250)
		{
			bill=(50*0.50)+(100*0.75)+(units-150)*1.20;
		}
		else
		{
			bill=(50*0.50)+(100*1.20)+(100*1.20)+(units-250)*1.50;
		}
		bill=bill+(bill*20)/100;
		System.out.println( bill);
		
	}

}

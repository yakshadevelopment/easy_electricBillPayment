package java9.easy.easyapp1;

import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of consumers bill to prepare:");
		int no=Integer.parseInt(scanner.nextLine());
		if(no<=0)
		{
			System.out.println("invalid input");
			System.exit(0);
		}
		Consumer consumerArray[]=new Consumer[no];
		for(int i=0;i<no;i++)
		{
			int j=i+1;
		  System.out.println("Enter details of consumer number "+j+":");
		  String input=scanner.nextLine();
		  String arr[]=input.split(",");
		  consumerArray[i]=new Consumer(arr[0],arr[1],Integer.parseInt(arr[2]));
		  String value=BillService.billCalcultion(consumerArray[i]);
		  consumerArray[i].setFinalPayment(value);
		  }
		System.out.println(String.format("%-5s %-20s %-10s %-10s","ID","NAME","CONSUME UNIT","AMOUNT"));
		for(Consumer consumer:consumerArray)
			System.out.println(consumer);
	
    }
}

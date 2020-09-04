package java9.easy.easyapp1;

import java.text.DecimalFormat;

public class BillService {
	public static String billCalcultion(Consumer consumer)
	{
		double billValue=0.0;
		int consumption=consumer.getUnitConsumed();
		if(consumption<=200)
		billValue=300.00;
		else if(consumption<=500)
		{
			int remain=consumption-200;
			billValue=300.00+(remain*1.25);
			
		}
		else if(consumption<=1000)
		{
			int remain=consumption-500;
			billValue=300.00+((500-200)*1.25)+(remain*1.00);
		}
		else 
		{
			int remain=consumption-1000;
			billValue=300.00+((500-200)*1.25)+((1000-500)*1.00)+(remain*0.75);
	
		}
		DecimalFormat decimalFormat=new DecimalFormat("0.00");
		String finalPayment=decimalFormat.format(billValue);		
		return finalPayment;
	}

}

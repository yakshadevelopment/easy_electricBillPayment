package java9.easy.easyapp1;

import static java9.easy.easyapp1.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class BillServiceTest {

	@Test
	public void testBillCalcultion() throws Exception {
		Consumer con1=new Consumer("421","John",1050);
		Consumer con2=new Consumer("519","Stella",150);
		Consumer con3=new Consumer("218","Clare",60);
		String value1=BillService.billCalcultion(con1);
		String value2=BillService.billCalcultion(con2);
		String value3=BillService.billCalcultion(con3);
		yakshaAssert(currentTest(),(value1.equals("1212.50")?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(value2.equals("300.00")?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(value3.equals("760.00")?"true":"false"),businessTestFile);
	
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}

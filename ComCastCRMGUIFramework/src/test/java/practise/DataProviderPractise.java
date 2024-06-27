package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.FileUtility.ExcelUtility;

public class DataProviderPractise {

		@Test(dataProvider ="getData")
		public void CreateContactTest(String name,String desg) {
			System.out.println("name : "+name+"/"+"desg : "+desg);
		}	
	

@DataProvider
public Object[][] getData() throws Throwable{
	ExcelUtility ELib = new ExcelUtility();
	int rowcount =ELib .getRowcount("Sheet1");
	

	Object[][] obj = new Object[rowcount][2];
	
	for(int i=0;i<rowcount;i++) {
		obj[i][0]=ELib.getDataFromExcel("Sheet1",i, 0);
		obj[i][1]=ELib.getDataFromExcel("Sheet1",i, 1);
	}
	return obj;
		
	}
	
	
}	
		
		


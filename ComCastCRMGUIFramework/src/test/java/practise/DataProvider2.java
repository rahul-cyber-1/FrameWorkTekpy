package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider ="getData")
	public void CreateContactTest(String firstname,String secondname,long mobnum) {
		System.out.println("firstname : "+firstname+"/"+"secondname : "+secondname+"/"+"mobnum : "+mobnum);
		
	}
@DataProvider
public Object[][] getData(){
	Object[][] obj = new Object[3][3];
	obj[0][0]="RAHUL";
	obj[0][1]="AE";
	obj[0][2]=9332490431l;
	obj[1][0]="RAM";
	obj[1][1]="AE";
	obj[1][2]=9365233336l;
	obj[2][0]="ROHIT";
	obj[2][1]="AE";
    obj[2][2]=9652331455l;
    return obj;
	
	
}

}

package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test(dataProvider =  "getData")
	public void CreateContactTest(String FirstName, String lastname) {
System.out.println("firstname : "+ FirstName + " lastname : "+ lastname);
	}
      @DataProvider
	public Object[][] getData() {

		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Rahul";
		obj[0][1] = "AE";
		obj[1][0] = "Ram";
		obj[1][1] = "AE";
		obj[2][0] = "Rohit";
		obj[2][1] = "AE";
		return obj;
	}

}

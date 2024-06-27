package practise;

import org.testng.annotations.Test;

public class ContactTest {
@Test
	public void createContactTest() {
		System.out.println("execute createContact");
		String str=null;
		System.out.println(str.equals("ser123"));
	}

	@Test(dependsOnMethods="createContactTest")
	public void modifyContact() {
		System.out.println("execute modifyContact");
	}
	@Test(dependsOnMethods="modifyContact")
	public void deleteContact() {
		System.out.println("execute deleteContact");
	}
}

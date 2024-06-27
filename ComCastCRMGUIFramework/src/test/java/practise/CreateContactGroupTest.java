package practise;

import org.testng.annotations.Test;

import baseClass.BaseClassdemo;

public class CreateContactGroupTest extends BaseClassdemo{
	@Test(groups = "SmokeTesting")
	public void createContactGroupTest1() {
		System.out.println("excute create contact group1 test");
		
	}
	@Test(groups = "RegressionTest")
	public void createContactGroupTest2() {
		System.out.println("excute create contact group2 test");
	}
	@Test(groups = "RegressionTest")
	public void createContactGroupTest3() {
		System.out.println("execute create contact group3 test");
	}

}

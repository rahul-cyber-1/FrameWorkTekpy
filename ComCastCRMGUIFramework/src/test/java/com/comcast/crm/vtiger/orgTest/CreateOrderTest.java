package com.comcast.crm.vtiger.orgTest;

import org.testng.annotations.Test;

import baseClass.BaseClassUpdated;

public class CreateOrderTest  extends BaseClassUpdated{
	@Test
	public void createOrderTest() {
		System.out.println("Execute createOrderTest==>123");
		String str= null;
		System.out.println(str.equals("123"));
	}
	@Test(dependsOnMethods = "createOrderTest")
	public void billingAnOrderTest() {
		System.out.println("{Execute billingAnOrderTest==> 123");
	}

}

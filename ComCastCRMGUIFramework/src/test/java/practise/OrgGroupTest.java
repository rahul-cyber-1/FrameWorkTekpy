package practise;

import org.testng.annotations.Test;

import baseClass.BaseClassdemo;

public class OrgGroupTest extends BaseClassdemo {
 @Test(groups = "SmokeTest")
 public void orgGroup1Test() {
	 System.out.println("execute org group1 test");
	
 }
@Test(groups = "RegressionTest")
public void orgGroup2Test() {
	System.out.println("execute org group2 test");
}
@Test(groups = "RegressionTest")
public void orgGroup3Test() {
	System.out.println("execute org group3 test");
}
}

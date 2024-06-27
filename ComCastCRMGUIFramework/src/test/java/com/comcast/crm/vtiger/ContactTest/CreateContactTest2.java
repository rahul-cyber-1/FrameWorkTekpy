package com.comcast.crm.vtiger.ContactTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.BaseClassUpdated;
@Listeners()
public class CreateContactTest2 extends BaseClassUpdated {
	
		@Test
		public void createContactTest() {
			System.out.println("execute createContact");
			String str=null;
			System.out.println(str.equals("ser123"));
		}

		@Test()
		public void modifyContact() {
			System.out.println("execute modifyContact");
		}
		@Test()
		public void deleteContact() {
			System.out.println("execute deleteContact");
		}
		}



package com.comcast.crm.vtiger.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber() {
		Random random= new Random();
	  int randomnum = random.nextInt(5000);
		return randomnum;
	}
public String getsysDate() {
	Date dateobj =new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    String date=sdf.format(dateobj);
    return date;
}
 public String requiredDate(int days) {
	    Date dateobj =new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	   String sdate=sdf.format(dateobj);
	    Calendar cal=sdf.getCalendar();
	    cal.add(Calendar.DAY_OF_MONTH,days);
	    String reqDate=sdf.format(cal.getTime());
	    return reqDate;
	
 }


    
  
	

	
}

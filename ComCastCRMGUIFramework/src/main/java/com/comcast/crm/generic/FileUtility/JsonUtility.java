package com.comcast.crm.generic.FileUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.mysql.cj.xdevapi.JsonParser;

import jdk.internal.org.jline.reader.Parser;

public class JsonUtility {
	public String getDataFromJsonFile(String key) throws Throwable {
		FileReader fis = new FileReader("./ConfigAppDta/CommonData.json");
		JSONParser PARSER = new JSONParser();
	    Object obj= PARSER.parse(fis);
		JSONObject map = (JSONObject)obj;	
		String data = (String) map.get(key);
		 return data;
		
		
	}
	

}

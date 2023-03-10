package util;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestClass {

	public static void main(String[] args) throws IOException  {	
		// TODO Auto-generated method stub
		
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		
		String filepath = userDir + "\\src\\main\\java\\config\\config_UAT.properties";
		System.out.println(filepath);
		
		File file = new File(filepath);

		FileReader fileReader = new FileReader(file);
		
		Properties prop = new Properties();
		prop.load(fileReader);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));

	}

}

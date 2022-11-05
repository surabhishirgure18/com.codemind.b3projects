package com.codemind.b3project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityMethods {
	
	public static String getProperty(String key) throws IOException, FileNotFoundException {
		Properties properties = new Properties();
		File file = new File("src/test/resources/masterData.properties");
		FileInputStream fileInputStream;
        fileInputStream = new FileInputStream(file);
		properties.load(fileInputStream);

		return properties.getProperty(key);

}
}

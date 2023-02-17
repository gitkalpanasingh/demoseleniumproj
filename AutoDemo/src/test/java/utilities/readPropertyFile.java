package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\softwares_Kalpana\\Selenium_project\\AutoDemo\\src\\test\\resources\\configfiles\\browserandurl.properties");
		
		Properties property = new Properties();
		property.load(fr);
		
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		
		

	}

}

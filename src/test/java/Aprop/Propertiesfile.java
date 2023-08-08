package Aprop;

import java.io.InputStream;
import java.util.Properties;

public class Propertiesfile {

	public Properties LoadProperties() {
		
		try {
			InputStream instream= getClass().getClassLoader().getResourceAsStream("url.properties");
			Properties prop =new Properties();
			prop.load(instream);
			return prop;
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			return null;
		}
	}
}

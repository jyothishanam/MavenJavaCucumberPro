package MySteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	static Properties prop;
	
		static {
			try {
				prop=new Properties();
				FileInputStream configFile=new FileInputStream("C:\\Users\\yogendar\\workspace\\com.CucumberProject.MavenProject\\src\\test\\resources\\config.properties");
			
			prop.load(configFile);
			
		}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}



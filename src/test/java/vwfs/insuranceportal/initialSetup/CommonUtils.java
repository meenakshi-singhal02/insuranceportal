package vwfs.insuranceportal.initialSetup;

import java.io.FileInputStream;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class CommonUtils.
 */
public class CommonUtils {

	/**
	 * Gets the val from resource.
	 * @return the val from resource
	 */
	public static Properties getValFromResource(){
		Properties config = new Properties();
		try
		{
			FileInputStream fsConfig = new FileInputStream(
			System.getProperty("user.dir") + "/src/test/resources/Configuration.properties");
			config.load(fsConfig);					
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return config; 
	}
	
	/**
	 * Gets the val from data.
	 * @return the val from data
	 */
	public static Properties getValFromData() {
		Properties config = new Properties();
		try
		{
			FileInputStream fsConfig = new FileInputStream(
			System.getProperty("user.dir") + "/src/test/resources/Data.properties");
			config.load(fsConfig);					
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return config;		
	}
		
	
	/**
	 * Gets the properties value.
	 * @param propkey the propkey
	 * @param prop the prop
	 * @return the properties value
	 */
	public static String getPropertiesValue(String propkey, Properties prop)
	{
		String sValue = prop.getProperty(propkey);
		return sValue;
	}

}

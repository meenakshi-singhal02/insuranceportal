package vwfs.insuranceportal.initialSetup;

import org.openqa.selenium.WebDriver;

/**
 * The Class TestBase.
 */
public class TestBase {

	/**
	 * Gets the web driver.
	 * @return the web driver
	 */
	public static WebDriver getWebDriver() {
		if (Hooks.driver == null) {
			synchronized (TestBase.class) {
				Hooks.getDriver();
			}
		}
		return Hooks.driver;
	}

}

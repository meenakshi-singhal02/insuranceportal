package vwfs.insuranceportal.pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class VWFSHomePage.
 */
public class VWFSHomePage {

	
	/** The driver. */
	WebDriver driver;
	
	
	/**
	 * Instantiates a new VWFS home page.
	 * @param driver the driver
	 */
	public VWFSHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/** The vwfs home page welcome text. */
	@FindBy(xpath="//*[@class='personalhomepage']/h2")
	private WebElement vwfsHomePageWelcomeText;
	
	/**
	 * Verify VWFS home page.
	 * @param text the text
	 * @return true, if successful
	 */
	public boolean verifyVWFSHomePage(String text) {
		boolean flag = false;
		if (vwfsHomePageWelcomeText.getText().contains(text)) {
			flag = true;
		}
		return flag;
	}
	
}

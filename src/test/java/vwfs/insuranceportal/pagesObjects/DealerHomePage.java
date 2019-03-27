package vwfs.insuranceportal.pagesObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * The Class DealerHomePage.
 */
public class DealerHomePage {

	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new dealer home page.
	 *
	 * @param driver the driver
	 */
	public DealerHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/** The vehicle reg input box. */
	@FindBy(id = "vehicleReg")
	private WebElement vehicleRegInputBox;
	
	/** The search vehicle button. */
	@FindBy(xpath="//span[text()='Find vehicle']")
	private WebElement searchVehicleButton;

	/** The result element. */
	@FindBy(className="result")
	private WebElement resultElement;
	
	/** The empty search error. */
	@FindBy(className="error-required")
	private WebElement emptySearchError;
	
	/** The dealer search title. */
	@FindBy(id="dlg-dealersearch-title")
	private WebElement dealerSearchTitle;
	
	/** The dealer search sub title. */
	@FindBy(id="dlg-dealersearch-subtitle")
	private WebElement dealerSearchSubTitle;
	
	/** The dealer page title. */
	@FindBy(xpath="//*[@title='Volkswagen Financial Services']")
	private WebElement dealerPageTitle;
	
	/** The dealer page title link. */
	@FindBy(xpath="//a")
	private WebElement dealerPageTitleLink;
	
	/**
	 * Enter registration no.
	 *
	 * @param regNo the reg no
	 */
	public void enterRegistrationNo(String regNo) {
		vehicleRegInputBox.clear();
		vehicleRegInputBox.sendKeys(regNo);
		vehicleRegInputBox.sendKeys(Keys.ENTER);
	}
	
	/**
	 * Search registration no.
	 */
	public void searchRegistrationNo() {
		searchVehicleButton.click();
	}

	/**
	 * Click on dealer title.
	 */
	public void clickOnDealerTitle()
	{
		dealerPageTitleLink.click();
	}
	
	/**
	 * Verify dealer page title.
	 *
	 * @return true, if successful
	 */
	public boolean verifyDealerPageTitle() {
		boolean flag = false;
		if (dealerPageTitle.isDisplayed()) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * Verify dealer search title.
	 *
	 * @param searchTitle the search title
	 * @return true, if successful
	 */
	public boolean verifyDealerSearchTitle(String searchTitle) {
		boolean flag = false;
		if (dealerSearchTitle.getText().contains(searchTitle)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * Verify dealer search sub title.
	 *
	 * @param searchSubTitle the search sub title
	 * @return true, if successful
	 */
	public boolean verifyDealerSearchSubTitle(String searchSubTitle) {
		boolean flag = false;
		if (dealerSearchSubTitle.getText().contains(searchSubTitle)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * Verify search result page records.
	 *
	 * @param registrationData the registration data
	 * @return true, if successful
	 */
	public boolean verifySearchResultPageRecords(String registrationData) {
		boolean flag = false;
		if (resultElement.getText().contains(registrationData)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * Verify warning for empty reg no.
	 *
	 * @param emptySearchErrorMsg the empty search error msg
	 * @return true, if successful
	 */
	public boolean verifyWarningForEmptyRegNo(String emptySearchErrorMsg) {
		boolean flag = false;
		if (emptySearchError.getText().contains(emptySearchErrorMsg)) {
			flag = true;
		}
		return flag;
	}
	
	
	
}

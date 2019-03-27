package vwfs.insuranceportal.stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vwfs.insuranceportal.initialSetup.CommonUtils;
import vwfs.insuranceportal.initialSetup.TestBase;
import vwfs.insuranceportal.pagesObjects.DealerHomePage;
import vwfs.insuranceportal.pagesObjects.VWFSHomePage;


/**
 * The Class stepDefinition.
 */
public class stepDefinition extends TestBase {

	/** The driver. */
	WebDriver driver = getWebDriver();
	
	/** The prop data. */
	Properties propData = CommonUtils.getValFromData();
	

	/**
	 * I navigate browser to.
	 */
	@Given("^I navigate browser to \"([^\"]*)\"$")
	public void i_Navigate_browser_to(String arg1) throws Throwable {
		Properties propConfig = CommonUtils.getValFromResource();
		String baseURL= CommonUtils.getPropertiesValue(arg1, propConfig);
		driver.get(baseURL);			
		}
	
	/**
	 * I should verify page title as.
	 */
	@Then("^I should verify page title$")
	public void i_should_verify_page_title_as() throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		boolean flag = objDealerHomePage.verifyDealerPageTitle();
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}

	/**
	 * I should verify dealer search title.
	 */
	@Then("^I should verify dealer search Title \"([^\"]*)\"$")
	public void i_should_verify_dealer_search_Title(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String searchtitle= CommonUtils.getPropertiesValue(arg1, propData);
		boolean flag = objDealerHomePage.verifyDealerSearchTitle(searchtitle);
		Assert.assertTrue(flag, "Search Result page is not getting displayed");	
	}

	/**
	 * I should verify dealer sub title search title. 
	 */
	@Then("^I should verify dealer sub title search Title \"([^\"]*)\"$")
	public void i_should_verify_dealer_sub_title_search_Title(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String searchSubtitle= CommonUtils.getPropertiesValue(arg1, propData);
		boolean flag = objDealerHomePage.verifyDealerSearchSubTitle(searchSubtitle);
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}

	/**
	 * I click on then title link.
	 */
	@When("^I click on then title link$")
	public void i_click_on_then_title_link() throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		objDealerHomePage.clickOnDealerTitle();
	}

	/**
	 * I should navigate to welcome page of vwfsinsuranceportal. 
	 */
	@Then("^I should navigate to welcome page of vwfsinsuranceportal \"([^\"]*)\"$")
	public void i_should_navigate_to_welcome_page_of_vwfsinsuranceportal(String arg1) throws Throwable {
		VWFSHomePage objVWFSHomePage = new VWFSHomePage(driver);
		String vwfsWelcomeTitle= CommonUtils.getPropertiesValue(arg1, propData);
		objVWFSHomePage.verifyVWFSHomePage(vwfsWelcomeTitle);
	}
	
	/**
	 * I enter on dealer portal.	 
	 */
	@When("^I enter \"([^\"]*)\" on dealer portal$")
	public void i_enter_on_dealer_portal(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String registrationNo= CommonUtils.getPropertiesValue(arg1, propData);
		objDealerHomePage.enterRegistrationNo(registrationNo);
	}

	/**
	 * I search for on dealer portal. 
	 */
	@When("^I search for on dealer portal$")
	public void i_search_for_on_dealer_portal() throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		objDealerHomePage.searchRegistrationNo();
	}
	
	/**
	 * I should verify search result page for records. 	 
	 */
	@Then("^I should verify search result page for records \"([^\"]*)\"$")
	public void i_should_verify_search_result_page_for_records(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String registrationNo= CommonUtils.getPropertiesValue(arg1, propData);
		boolean flag = objDealerHomePage.verifySearchResultPageRecords(registrationNo);
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}
	
	/**
	 * I should verify warning for invalid car number.
	 */
	@Then("^I should verify warning for \"([^\"]*)\" for car number$")
	public void i_should_verify_warning_for_invalid_car_number(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String warningForEmptyRegNo= CommonUtils.getPropertiesValue(arg1, propData);
		boolean flag = objDealerHomePage.verifyWarningForEmptyRegNo(warningForEmptyRegNo);
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}
	
	/**
	 * I should verify search result page for no records	 
	 */
	@Then("^I should verify search result page for no records \"([^\"]*)\"$")
	public void i_should_verify_search_result_page_for_no_records(String arg1) throws Throwable {
		DealerHomePage objDealerHomePage = new DealerHomePage(driver);
		String noRecordsFound= CommonUtils.getPropertiesValue(arg1, propData);
		boolean flag = objDealerHomePage.verifySearchResultPageRecords(noRecordsFound);
		Assert.assertTrue(flag, "Search Result page is not getting displayed");
	}

}

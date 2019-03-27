@dealersearchportal @ui
Feature: Verify insurance portal for dealer
	
	
	Scenario: Verify dealer(vwfs insurance portal) page UI
		Given I navigate browser to "resourceURL"
		Then  I should verify page title
		Then  I should verify dealer search Title "dealerSearchTitle"
		Then  I should verify dealer sub title search Title "dealerSearchSubTitle"
		When  I click on then title link 
		Then  I should navigate to welcome page of vwfsinsuranceportal "vwfspageWelcomeTitle"
	
	@smoke
  Scenario: Verify that user is able to search for valid record
    Given I navigate browser to "resourceURL"
    When  I enter "regNo" on dealer portal
    When  I search for on dealer portal
    Then  I should verify search result page for records "regNo"

 	Scenario: Verify that user should get warning for both empty registration no. and record not found	
    Given I navigate browser to "resourceURL"
    When  I search for on dealer portal
    Then  I should verify warning for "emptyRegistrationNo" for car number
    When  I enter "invalidRegNp" on dealer portal
    When  I search for on dealer portal
    Then  I should verify search result page for no records "noRecord"

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DealerPortalSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Verify insurance portal for dealer",
  "description": "",
  "id": "verify-insurance-portal-for-dealer",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@dealersearchportal"
    },
    {
      "line": 1,
      "name": "@ui"
    }
  ]
});
formatter.before({
  "duration": 5435002900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify dealer(vwfs insurance portal) page UI",
  "description": "",
  "id": "verify-insurance-portal-for-dealer;verify-dealer(vwfs-insurance-portal)-page-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate browser to \"resourceURL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should verify page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should verify dealer search Title \"dealerSearchTitle\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should verify dealer sub title search Title \"dealerSearchSubTitle\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on then title link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should navigate to welcome page of vwfsinsuranceportal \"vwfspageWelcomeTitle\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "resourceURL",
      "offset": 23
    }
  ],
  "location": "stepDefinition.i_Navigate_browser_to(String)"
});
formatter.result({
  "duration": 1267901000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_should_verify_page_title_as()"
});
formatter.result({
  "duration": 67420200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealerSearchTitle",
      "offset": 37
    }
  ],
  "location": "stepDefinition.i_should_verify_dealer_search_Title(String)"
});
formatter.result({
  "duration": 62752400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealerSearchSubTitle",
      "offset": 47
    }
  ],
  "location": "stepDefinition.i_should_verify_dealer_sub_title_search_Title(String)"
});
formatter.result({
  "duration": 71338500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_then_title_link()"
});
formatter.result({
  "duration": 737591500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vwfspageWelcomeTitle",
      "offset": 58
    }
  ],
  "location": "stepDefinition.i_should_navigate_to_welcome_page_of_vwfsinsuranceportal(String)"
});
formatter.result({
  "duration": 125911800,
  "status": "passed"
});
formatter.after({
  "duration": 813353400,
  "status": "passed"
});
formatter.before({
  "duration": 3824361000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify that user is able to search for valid record",
  "description": "",
  "id": "verify-insurance-portal-for-dealer;verify-that-user-is-able-to-search-for-valid-record",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I navigate browser to \"resourceURL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter \"regNo\" on dealer portal",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I search for on dealer portal",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should verify search result page for records \"regNo\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "resourceURL",
      "offset": 23
    }
  ],
  "location": "stepDefinition.i_Navigate_browser_to(String)"
});
formatter.result({
  "duration": 1008595600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "regNo",
      "offset": 9
    }
  ],
  "location": "stepDefinition.i_enter_on_dealer_portal(String)"
});
formatter.result({
  "duration": 360088700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_search_for_on_dealer_portal()"
});
formatter.result({
  "duration": 116423000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "regNo",
      "offset": 48
    }
  ],
  "location": "stepDefinition.i_should_verify_search_result_page_for_records(String)"
});
formatter.result({
  "duration": 382247100,
  "status": "passed"
});
formatter.after({
  "duration": 739008900,
  "status": "passed"
});
formatter.before({
  "duration": 3717274100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify that user should get warning for both empty registration no. and record not found",
  "description": "",
  "id": "verify-insurance-portal-for-dealer;verify-that-user-should-get-warning-for-both-empty-registration-no.-and-record-not-found",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I navigate browser to \"resourceURL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I search for on dealer portal",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I should verify warning for \"emptyRegistrationNo\" for car number",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I enter \"invalidRegNp\" on dealer portal",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I search for on dealer portal",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should verify search result page for no records \"noRecord\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "resourceURL",
      "offset": 23
    }
  ],
  "location": "stepDefinition.i_Navigate_browser_to(String)"
});
formatter.result({
  "duration": 2688458600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_search_for_on_dealer_portal()"
});
formatter.result({
  "duration": 81773800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emptyRegistrationNo",
      "offset": 29
    }
  ],
  "location": "stepDefinition.i_should_verify_warning_for_invalid_car_number(String)"
});
formatter.result({
  "duration": 43609000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalidRegNp",
      "offset": 9
    }
  ],
  "location": "stepDefinition.i_enter_on_dealer_portal(String)"
});
formatter.result({
  "duration": 222884900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_search_for_on_dealer_portal()"
});
formatter.result({
  "duration": 69737000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "noRecord",
      "offset": 51
    }
  ],
  "location": "stepDefinition.i_should_verify_search_result_page_for_no_records(String)"
});
formatter.result({
  "duration": 150355200,
  "status": "passed"
});
formatter.after({
  "duration": 705638300,
  "status": "passed"
});
});
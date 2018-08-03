$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Search with Valid Data as a Guest User",
  "description": "",
  "id": "search;search-with-valid-data-as-a-guest-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Guest User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Guest User close the pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Guest User click on the SearchTextBox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Guest User enter valid SearchTerm",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Guest User click on SearchButton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the valid product should be display on the PLP",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdef.guest_User_is_on_HomePage()"
});
formatter.result({
  "duration": 15797533491,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_close_the_pop_up_window()"
});
formatter.result({
  "duration": 3316960980,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_click_on_the_SearchTextBox()"
});
formatter.result({
  "duration": 335543322,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_enter_valid_SearchTerm()"
});
formatter.result({
  "duration": 444836350,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_click_on_SearchButton()"
});
formatter.result({
  "duration": 3845097222,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStepdef.the_valid_product_should_be_display_on_the_PLP()"
});
formatter.result({
  "duration": 125238487,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "validate the  autosearch functionality with valid first three characters",
  "description": "",
  "id": "search;validate-the--autosearch-functionality-with-valid-first-three-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Guest User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Guest User close the pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Guest User click on the SearchTextBox",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Guest User enter valid first three characters in SearchTextBox",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Guest User can able to see the autosearch options",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdef.guest_User_is_on_HomePage()"
});
formatter.result({
  "duration": 14034282035,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_close_the_pop_up_window()"
});
formatter.result({
  "duration": 3443942882,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_click_on_the_SearchTextBox()"
});
formatter.result({
  "duration": 243043142,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.guest_User_enter_valid_first_three_characters_in_SearchTextBox()"
});
formatter.result({
  "duration": 283434168,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultStepdef.guest_User_can_able_to_see_the_autosearch_options()"
});
formatter.result({
  "duration": 220167,
  "status": "passed"
});
});
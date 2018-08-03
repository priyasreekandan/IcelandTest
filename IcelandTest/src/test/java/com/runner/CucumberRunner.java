package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:/Users/priyahari/Desktop/workspace/IcelandTest/src/test/resources/features",
  glue={"com.stepdefinition"}
 // format={"pretty","html:test-output"}
  //tags= {"@search"}
  )
public class CucumberRunner extends BaseAction {

}

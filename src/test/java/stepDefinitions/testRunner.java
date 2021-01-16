package stepDefinitions;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/Users/haque/OneDrive/Documents/Workspace/six/WebAutomation/src/test/resources/Feature"
 ,glue={"stepDefinitions"}
 ,format = {"pretty", "html:target/cucumber"}
 ,monochrome =true
,strict =true
,tags = {"@smoke"}
	
 )

public class testRunner {

}

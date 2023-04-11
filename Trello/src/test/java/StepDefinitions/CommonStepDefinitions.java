package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Utility.BaseClass;

public class CommonStepDefinitions {
	
	BaseClass baseClass = new BaseClass();
	
	
	@Given("I Open Trello Environment")
	public void i_open_trello_environment() {
	    baseClass.launchBrowser();
	    
	}
	
	@Then("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
	    baseClass.closeApplication();
	}
	
}

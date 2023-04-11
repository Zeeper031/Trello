package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.testng.Reporter;
import Pages.HomePage;
import Utility.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeStepDefinitions extends BaseClass{

	HomePage homePage = new HomePage(BaseClass.driver);
	


	@When("I click in LogIn button")
	public void i_click_in_log_in_button() {

		homePage.getLogInButton().click();
	}

	@Then("I should get my trello boards page")
	public void i_should_get_my_trello_boards_page() {
		
		Assert.assertNotNull(homePage.getAccountSettingButton());
		Reporter.log("Account verified Successfully", true);
	}
	
	@When("I click in templates button")
	public void i_click_in_templates_button() {
	    homePage.getTemplatesButton().click();
	    
	}
	@Then("I should get main templates")
	public void i_should_get_main_templates() {
	    Assert.assertNotNull("Template List not displayed", homePage.getTemplatesList());
	   
	}
	@Then("I click on each main tamplete, and I validate if new board was created successfully")
	public void i_click_on_each_main_tamplete_and_i_validate_if_new_board_was_created_successfully() throws InterruptedException {
	    //Select sel = new Select(homePage.getTemplatesList());
		homePage.getTemplatesButton().click();
	    List<WebElement> options = driver.findElements(By.xpath("//*[@class=\"VSxlmEYC3befsX\"]"));
	    for(int i=0;i<options.size(); i++) {
	    	options.get(i).click();
	    	Reporter.log("",options.size(), true);
	    	String boardTitle = homePage.getBoardTitleTextBox().getAttribute("value");
	    	//Thread.sleep(2000);
	    	homePage.getCreateBoardButton().click();
	    	Assert.assertNotNull("New Board not found", homePage.getBoardNewlyCreated(boardTitle));
	    	homePage.getTrelloButton().click();
	    }
	    
	}

}

package StepDefinitions;

import org.junit.Assert;
import org.testng.Reporter;

import Pages.LogInPage;
import Utility.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefinitions extends BaseClass{
	
	LogInPage logIn = new LogInPage(BaseClass.driver);
	
	
	
	@When("I enter correct email in email searchbox")
	public void i_enter_correct_email_in_email_searchbox() {
	    logIn.getUserSearchBox().sendKeys("vargas.36047@gmail.com");
	    
	}

	@When("I click in continue button")
	public void i_click_in_continue_button() {
	    logIn.getContinueButton().click();
	    
	}

	@When("I enter correct password in password searchbox")
	public void i_enter_correct_password_in_password_searchbox() throws Exception {
	    logIn.getPasswordSearchBox().sendKeys("Drifter360.");
	    
	}

	@When("I click in Log in button real")
	public void i_click_in_log_in_button_real() {
	    logIn.getLogInButtonReal().click();
	    
	}
	
	@When("I click in Log in button fake")
	public void i_click_in_log_in_button_fake() {
	    logIn.getLogInButtonFake().click();
	    
	}
	
	@When("I enter incorrect email in email searchbox")
	public void i_enter_incorrect_email_in_email_searchbox() {
	    logIn.getUserSearchBox().sendKeys("luis.vargas@123.com");
	    
	}
	
	@When("I enter incorrect password in password searchbox")
	public void i_enter_incorrect_password_in_password_searchbox() {
	    logIn.getPasswordSearchBox().sendKeys("Test1234");
	}
	
	@Then("I should get LogIn error message")
	public void i_should_get_log_in_error_message() {
	    Assert.assertNotNull("Error message not displayed", logIn.getLogInErrorMesage());
	    Reporter.log("Error message displayed successfully", true);
	}
	
	@And("I click in Continue with Google")
	public void i_click_in_continue_with_google() {
		logIn.getContinueWithGoogleButton().click();
	}
	
	@Then("I should be redirected to Google account authenticator page")
	public void i_should_be_redirected_to_google_account_authenticator_page() {
		Assert.assertNotNull("Google Authentication Box is not Displayed", logIn.getGoogleAuthenticatorBox());
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Google Authenticatior page not loaded", url.contains("accounts.google.com"));
	}
	
	@And("I click in Continue with Microsoft")
	public void i_click_in_continue_with_microsoft() {
		logIn.getContinueWithMicrosoftButton().click();
	}
	
	@Then("I should be redirected to Microsoft account authenticator page")
	public void i_should_be_redirected_to_microsoft_account_authenticator_page() {
		Assert.assertNotNull("Microsoft Authenticator Box is not Displayed", logIn.getMicrosoftAuthenticatorBox());
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Microsoft Authenticatior page not loaded", url.contains("login.microsoftonline.com"));
	}
	
	@And("I click in Continue with Apple")
	public void i_click_in_continue_with_apple() {
		logIn.getContinueWithAppleButton().click();
	}
	
	@Then("I should be redirected to Apple account authenticator page")
	public void i_should_be_redirected_to_apple_account_authenticator_page() {
		Assert.assertNotNull("Apple Authenticator Box is not Displayed", logIn.getAppleAuthenticatorBox());
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Apple Authenticatior page not loaded", url.contains("appleid.apple.com"));
	}
	
	@And("I click in Continue with Slack")
	public void i_click_in_continue_with_slack() {
		logIn.getContinueWithSlackButton().click();
	}
	
	@Then("I should be redirected to Slack account authenticator page")
	public void i_should_be_redirected_to_slack_account_authenticator_page() {
		Assert.assertNotNull("Slack Authenticator Box is not Displayed", logIn.getSlackAuthenticatorBox());
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Slack Authenticatior page not loaded", url.contains("slack.com"));
	}

}

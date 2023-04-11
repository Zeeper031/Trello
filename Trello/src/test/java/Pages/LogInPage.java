package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LogInPage {
	
	
	WebDriver driver;
	WebElement element;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserSearchBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"user\"]")));
		return element;
	}
	
	public WebElement getContinueButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]")));
		return element;
	}
	
	public WebElement getPasswordSearchBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]")));
		return element;
	}
	
	public WebElement getLogInButtonReal() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-submit\"]")));
		return element;
	}
	
	public WebElement getLogInButtonFake() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]")));
		return element;
	}
	
	public WebElement getLogInErrorMesage() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"error\"]/p")));
		return element;
	}
	
	public WebElement getContinueWithGoogleButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"googleButton\"]")));
		return element;
	}
	
	public WebElement getGoogleAuthenticatorBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"initialView\"]")));
		return element;
	}
	
	public WebElement getContinueWithMicrosoftButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"msftButton\"]")));
		return element;
	}
	
	public WebElement getMicrosoftAuthenticatorBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"lightbox\"]")));
		return element;
	}
	
	public WebElement getContinueWithAppleButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signInWithAppleButton\"]")));
		return element;
	}
	
	public WebElement getAppleAuthenticatorBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]")));
		return element;
	}
	
	public WebElement getContinueWithSlackButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"slackButton\"]")));
		return element;
	}
	
	public WebElement getSlackAuthenticatorBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page_contents\"]")));
		return element;
	}

}

package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebElement element;
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogInButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"BXP-APP\"]/header[1]/div/div[1]/div[2]/a[1]")));
		return element;
	}
	
	public WebElement getAccountSettingButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div[6]/button/div/span")));
		return element;
	}
	
	public WebElement getTemplatesButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[1]/div/div[1]/button[4]")));
		return element;
	}
	
	public WebElement getTemplatesList() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"lgRJn1LOwo5rN1\"]")));
		return element;
	}
	
	public WebElement getBoardTitleTextBox() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb\"]")));
		return element;
	}
	
	public WebElement getCreateBoardButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"ijFumaLuInvBrL bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc\"]")));
		return element;
	}
	
	public WebElement getBoardNewlyCreated(String boardTitle) {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.linkText(boardTitle)));
		return element;
	}
	
	public WebElement getTrelloButton() {
		element = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/a")));
		return element;
	}

}

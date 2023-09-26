package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsUtils {
	
	WebDriver driver;
	
	
	public elementsUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement WaitForElement(WebElement element, long durationInSecond) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSecond));
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}catch(Throwable e) 
		{
			e.printStackTrace();
		}
		return webElement;
	}
	
	
	public String getTextFromElement (WebElement element, long durationInSeconds ) {
		WebElement webElement = WaitForElement(element,durationInSeconds);
		return webElement.getText();
	}
	
public void typeTextIntoElement(WebElement element,String textToBeTyped,long durationInSeconds) {
		
		WebElement webElement = WaitForElement(element,durationInSeconds);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);
		
	}


public void clickOnElement(WebElement element,long durationInSeconds) {
	
	WebElement webElement = WaitForElement(element,durationInSeconds);
	webElement.click();
	
}

}

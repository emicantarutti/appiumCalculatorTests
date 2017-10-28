package appium.wonkyCalculatorTests.objectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ObjectRepository {
	
	public ObjectRepository(AndroidDriver<AndroidElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.test.calc:id/add")
	public WebElement addButton;
	
	@AndroidFindBy(id="com.test.calc:id/subtract")
	public WebElement substractButton;
	
	@AndroidFindBy(id="com.test.calc:id/sqrt")
	public WebElement sqrRoot;
	
	@AndroidFindBy(id="com.test.calc:id/divide")
	public WebElement divideButton;
	
	@AndroidFindBy(id="com.test.calc:id/multiply")
	public WebElement multiplyButton;
	
	@AndroidFindBy(id="com.test.calc:id/power")
	public WebElement pwrButton;
	
	
	public void clickOnAddButton(){
		addButton.click();
	}
	public void clickOnSubstractButton(){
		substractButton.click();
	}
	public void clickOnSqrButton(){
		sqrRoot.click();
	}
	public void clickOnDivideButton(){
		divideButton.click();
	}
	public void clickOnMultiplyButton(){
		multiplyButton.click();
	}
	public void clickOnPowerButton(){
		pwrButton.click();
	}
}

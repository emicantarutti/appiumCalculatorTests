package appium.wonkyCalculatorTests.tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import appium.wonkyCalculatorTests.objectModel.ObjectRepository;
import appium.wonkyCalculatorTests.setUp.BaseTestSetUp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalculatorSquareRootTests extends BaseTestSetUp{
	
	@Test
	public void verifyingTheSquareRoot() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = Capabilities();
		ObjectRepository repo = new ObjectRepository(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		repo.clickOnAddButton();
		repo.clickOnAddButton();
		repo.clickOnAddButton();
		repo.clickOnAddButton();
		
		repo.clickOnSqrButton();
		
		Assert.assertEquals(driver.findElementById("com.test.calc:id/result").getText(), "Result: 2");
	}
}

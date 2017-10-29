package appium.wonkyCalculatorTests.tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import appium.wonkyCalculatorTests.objectModel.ObjectRepository;
import appium.wonkyCalculatorTests.setUp.BaseTestSetUp;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalculatorSubstractionTests extends BaseTestSetUp{

	@Test
	public void verifyingTheSubstraction() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver = Capabilities();
		ObjectRepository repo = new ObjectRepository(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		repo.clickOnAddButton();
		repo.clickOnAddButton();
		
		repo.clickOnSubstractButton();
		repo.clickOnSubstractButton();
		repo.clickOnSubstractButton();
		repo.clickOnSubstractButton();

		Assert.assertEquals(driver.findElementById("com.test.calc:id/result").getText(), "Result: -2");
	}
}

package appium.wonkyCalculatorTests.setUp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/* 
*
* Created by Emiliano Cantarutti
* 
*/

public class BaseTestSetUp {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        File f = new File("src");
        File fs = new File(f, "Calculator.apk");


        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.CalculatorActivity");
        
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }
	
}

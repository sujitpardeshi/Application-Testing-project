package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {
	AppiumDriver driver;
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10 QKQ1.200114.002");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 8");
		caps.setCapability(MobileCapabilityType.UDID,"4394ea0d");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,caps);
		}catch(Exception exp) {
			System.out.println("Cause is :"+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
		}

		
	}
	@Test
	public void sampleTest() {
		System.out.println("i am inside sample Test");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		
	}
	
	

}

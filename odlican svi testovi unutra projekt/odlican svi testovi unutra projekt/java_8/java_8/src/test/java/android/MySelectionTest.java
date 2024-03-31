package android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.DashboardPage;
import Pages.MySelectionPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MySelectionTest {
	AndroidDriver<AndroidElement> driver;

	@Test(priority = 0)

	public void goMySelection() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		SecretsKeys key = new SecretsKeys();
		caps.setCapability("browserstack.user", key.User);
		caps.setCapability("browserstack.key", key.Password);
		caps.setCapability("app", key.App);

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "My Selection Test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> drivers = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		System.out.println("My Selection Test: ");
		driver = drivers;
	}

	@Test(priority = 1)
	public void buttonSkipTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Button Skip Test");
		DashboardPage dp = new DashboardPage(driver);
		dp.buttonSkip();
		dp.driverReturn();
	}

	@Test(priority = 2)
	public void buttonEnrollTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Button Enroll Test");
		DashboardPage dp = new DashboardPage(driver);
		dp.enrollButton();
		dp.driverReturn();
	}

	@Test(priority = 3)
	public void closePopUpTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Close PopUp Test");
		DashboardPage dp = new DashboardPage(driver);
		dp.closePopup();
		dp.driverReturn();
	}

	@Test(priority = 4)
	public void goToMySelectionTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Go To My Selection Test");
		MySelectionPage msp = new MySelectionPage(driver);
		msp.goMySelection();
		msp.driverReturn();
		driver.quit();
	}

}

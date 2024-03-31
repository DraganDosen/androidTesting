package android;

import java.net.URL;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

import Pages.CastVotesPage;
import Pages.DashboardPage;
import Pages.MySelectionPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CastVotesTest {
	@Test(priority = 1)

	public void goToCastVotes() throws MalformedURLException, InterruptedException {
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
		caps.setCapability("name", "Cast Votes Test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		System.out.println("Cast Vote test: ");
		DashboardPage dp = new DashboardPage(driver);

		dp.buttonSkip();
		dp.enrollButton();
		dp.closePopup();
		dp.driverReturn();

		CastVotesPage msp = new CastVotesPage(driver);
		msp.goCastVotes();
		msp.driverReturn();

		Thread.sleep(2000);
		// Invoke driver.quit() after the test is done to indicate that the test is
		// completed.
		if (driver != null) {
			System.out.println("driver is dif of 0");
			driver.quit();
		}

	}

}

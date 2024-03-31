package android;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import Pages.AdvisorsReviewPage;
import Pages.BasePage;
import Pages.DashboardPage;
import Pages.ProposalPage;
import Pages.TestPage;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import android.SecretsKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SmokeTest {
	AndroidDriver<AndroidElement> driver;

	@Test(priority = 0)

	public void smoke() throws MalformedURLException, InterruptedException {

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
		caps.setCapability("name", "smoketest");

		AndroidDriver<AndroidElement> drivers = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		driver = drivers;
	}

	@Test(priority = 1, description = "smoke")
	public void goToDashboardTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.buttonSkip();
		dp.enrollButton();
		dp.closePopup();
		dp.driverReturn();
		driver.quit();
	}

	
}


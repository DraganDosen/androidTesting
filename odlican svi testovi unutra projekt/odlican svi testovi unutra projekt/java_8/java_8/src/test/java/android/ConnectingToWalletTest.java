package android;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import Pages.BasePage;
import Pages.DashboardPage;
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

public class ConnectingToWalletTest {
	AndroidDriver<AndroidElement> driver;

	@Test(priority = 0)

	public void connectToWalletTest() throws MalformedURLException, InterruptedException {

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
		caps.setCapability("name", "Connecting to Wallet test");

		AndroidDriver<AndroidElement> drivers = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		driver = drivers;
	}

	@Test(priority = 1, description = "go to Dashboard")
	public void goToDashboardTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.buttonSkip();
		dp.enrollButton();
		dp.closePopup();
		dp.driverReturn();
	}

	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 2, description = "QR Code test")
	public void qRCodeTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);
		dp.qRCode();
		dp.driverReturn();
	}

	@Severity(SeverityLevel.NORMAL)
	@Test(priority = 3, description = "wrong pin in test")
	public void wrongPinTypeTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);
		dp.wrongPin();
		dp.driverReturn();
	}

	@Test(priority = 4, description = "Pin should not allow dots")
	@Severity(SeverityLevel.NORMAL)

	@TmsLink("VIT-2757")
	public void dotInPinTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.dotInPin();
		dp.driverReturn();

	}

	@Test(priority = 5, description = "Wrong Wallet Hach Code")
	public void wrongHashCodeTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.wrongWalletHash();
		dp.driverReturn();

	}

	@Test(priority = 6, description = "Incomplete Connection")
	@Severity(SeverityLevel.NORMAL)

	public void incopmpleteConnetion() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.IncompleteConnection();
		dp.driverReturn();

	}

	@Test(priority = 7, description = "Pin and hash are good")
	@Severity(SeverityLevel.NORMAL)

	public void successfullConnectTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.goodPinAndHash();
		dp.driverReturn();
		driver.quit();

	}

}

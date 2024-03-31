package Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URL;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import android.SecretsKeys;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import io.appium.java_client.pagefactory.AndroidFindBy;
import android.SecretsKeys;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

import org.openqa.selenium.support.PageFactory;

public class TestPage {
	protected AndroidDriver<AndroidElement> driver;
	public WebDriverWait wait;
	public TestPage(AndroidDriver<AndroidElement> driver) {
		//super(driver);
		
		this.driver = driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	public void goToProposal() throws MalformedURLException, InterruptedException {
		
		
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
		caps.setCapability("name", "Proposal_test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View")
    private AndroidElement alltextOnScreenHR;
	
	public void firtsmethod() throws InterruptedException{
		System.out.println("***-first method-***");
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(5000);
		AndroidElement textCardano = driver.findElement(By.className("android.widget.TextView"));
		Assert.assertEquals(textCardano.getText(), "Fund the future of Cardano");
		System.out.println("Connect to vote must be visible!!!");
	}
	public AndroidDriver<AndroidElement> driverReturn() {
		System.out.println("-return driver method-");
		return(driver);
	}
	
	public void buttonSkip()throws InterruptedException{
		System.out.println("***-second method-***");
		AndroidElement buttonSkip = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		System.out.println(buttonSkip.getText());
		buttonSkip.click();
		Thread.sleep(1000);
		List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextview) {

			System.out.println(el.getText());
		}
	}
	
	public void enrollButton()throws InterruptedException{
		List<AndroidElement> allButtons = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : allButtons) {

			System.out.println(el.getText());
			if (el.getText().equals("ENROLL TO RECEIVE NOTIFICATIONS")) {
				Thread.sleep(2000);
				el.click();
				Thread.sleep(2000);
			}
			}
				int i = 0; int j=0;
				for (i = 0; i< 30 && j!=10 ; i++) {
					Thread.sleep(1000);
					List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));
					for (AndroidElement elem : alltextview) {
						  System.out.println(i);
						  System.out.println(elem.getText());
						  if (elem.getText().equals("Fund9")) {
							//System.out.println("Test is in ENROLL or loader is still visible!");
							j = 10;
							
						  }
						
						
						}
				
		
		}}
		
	public void closePopup() {

		List<AndroidElement> closepopup = driver.findElements(By.className("android.widget.Image"));
		for (AndroidElement el : closepopup) {

			System.out.println(el.getText());
			if (el.getText().equals("icon")) {
				el.click();
				System.out.println(" popup is moved?");
				break;
			}
			//break;
			//Thread.sleep(1000);
		}
	}
	
	public void ConnectWallet() throws InterruptedException {
		SecretsKeys key = new SecretsKeys();
		//Thread.sleep(3000);
		System.out.println("***-ConnectWallet method-***");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(5000);
		//AndroidElement textCardano = driver.findElement(By.className("android.widget.TextView"));
		//Assert.assertEquals(textCardano.getText(), "Fund the future of Cardano");
		//System.out.println("Connect to vote must be visible!!!");
	    
		//AndroidElement alltextOnScreenHR = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View"));
		List<AndroidElement> conButtons = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : conButtons) {

			System.out.println(el.getText());
			if (el.getText().equals("CONNECT WALLET")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("wallet is clicked");
			}
			Thread.sleep(5000);
		}
		
		
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		

		

		List<AndroidElement> allButtonsList = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : allButtonsList) {
			System.out.println("All visible buttons!");
			System.out.println(el.getText());
			System.out.println("All visible buttons finish in iteration!");
		}
		
		AndroidElement yoroi = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"));
		yoroi.click();
		// WebDriverWait waitme;

		
		Thread.sleep(1000);
		
		System.out.println("Yoroi mobile is clicked!");

		List<AndroidElement> alltextOnScreen = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : alltextOnScreen) {
			System.out.println(el.getText());
			if (el.getText().equals("I'M READY TO PASTE MY HASH CODE")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("CLICKED ON READY TO PASTE");
			}

		}

		AndroidElement readyToPasteHC = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
		readyToPasteHC.click();
		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.walletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button"));
		confirmButton.click();
		List<AndroidElement> alltextOnScreen1 = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextOnScreen1) {
			System.out.println(el.getText());

		}
		List<AndroidElement> enterPinFieds = driver.findElements(By.className("android.widget.EditText"));
		int i = 1;
		for (AndroidElement el : enterPinFieds) {
			
			System.out.println(i);
			el.click();
			Thread.sleep(1000);
			el.sendKeys(String.valueOf(i));
			i = i + 1;
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		AndroidElement confirm = driver.findElement(By.className("android.widget.Button"));
	     confirm.click();
	     Thread.sleep(2000);
	    
	     AndroidElement got = driver.findElement(By.className("android.widget.Button"));
	     got.click();
	     Thread.sleep(2000);
	     
	     List<AndroidElement>walletConectedTexts = driver.findElements(By.className("android.widget.TextView"));
			
			for (AndroidElement el : walletConectedTexts) {
				System.out.println(el.getText());

			}
			//got.click();
			 Thread.sleep(5000);
			 //return(driver);
		// Invoke driver.quit() after the test is done to indicate that the test is
		// completed.
			 //driver.quit();
	}
}

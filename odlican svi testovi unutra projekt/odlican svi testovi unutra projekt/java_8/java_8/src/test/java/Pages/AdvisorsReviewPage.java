package Pages;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import static org.junit.Assert.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import android.SecretsKeys;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static org.junit.Assert.assertEquals;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidElement;

public class AdvisorsReviewPage extends BasePage {
	AndroidDriver<AndroidElement> driver;
	public WebDriverWait wait;

	public AdvisorsReviewPage(AndroidDriver<AndroidElement> driver) {
		// super(driver);
		this.driver = driver;
		// PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public AndroidDriver<AndroidElement> driverReturn() {
		System.out.println("return driver method");
		return (driver);
	}

	public void advisorScore() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		AndroidElement goInFilteredProposal = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.view.View"));
		goInFilteredProposal.click();
		Thread.sleep(2000);
		AndroidElement advisorScore = driver.findElement(By.xpath("//android.widget.TextView[@text='ADVISOR SCORE']"));
		AndroidElement advisorScoreLink = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Read Advisors Reviews (6)']"));

		if (!advisorScore.isDisplayed() || !advisorScoreLink.isDisplayed()) {
			assert false;
		}
		advisorScoreLink.click();
		Thread.sleep(2000);

		AndroidElement backToProposalDetailButton = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Back to Proposal Detail']"));
		AndroidElement iconInfoButton = driver.findElement(By.xpath("//android.widget.Image[@text='Icon Info']"));
		if (!backToProposalDetailButton.isDisplayed() || !iconInfoButton.isDisplayed()) {
			assert false;
		}
		iconInfoButton.click();
		Thread.sleep(2000);
		AndroidElement infoButton = driver.findElement(By.xpath("//android.widget.TextView[@text='INFO']"));
		if (!infoButton.isDisplayed()) {
			assert false;
		}
		backToProposalDetailButton.click();
		Thread.sleep(2000);
		if (!backToProposalDetailButton.isDisplayed()) {
			assert false;
		}
	}

}

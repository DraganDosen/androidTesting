package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.openqa.selenium.Alert;
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

public class DashboardPage extends BasePage {
//public class DashboardPage {
	AndroidDriver<AndroidElement> driver;
	public WebDriverWait wait;

	public DashboardPage(AndroidDriver<AndroidElement> driver) {
		// super(driver);
		this.driver = driver;
		// PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View")
	private AndroidElement alltextOnScreenHR;
	// WebDriverWait wait = new WebDriverWait(driver, 20);

	public void scrollingFirstPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("verifyCardanoTitle");

		Thread.sleep(2000);
		ArrayList<String> listOfTextView = new ArrayList<String>();
		ArrayList<String> listOfTextViewforComparing = new ArrayList<String>();
		listOfTextView.add("Fund the future of Cardano");
		listOfTextView.add(
				"You are about to discover innovative ideas around Cardano’s future development. You can help decide which ideas turn into real world projects.");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
		List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextview) {
			Reporter.log("list Of Text View for Comparing " + el.getText());
			System.out.println(el.getText());
			listOfTextViewforComparing.add(el.getText());
		}
		org.junit.Assert.assertEquals(listOfTextView, listOfTextViewforComparing);
		System.out.println("first page is compared");

		// List<AndroidElement> androidwidgetButton =
		// driver.findElements(By.className("android.widget.Button"));
		List<AndroidElement> androidwidgetButtonTwo = driver.findElements(By.className(widgetbutton));
		

		for (AndroidElement el : androidwidgetButtonTwo) {
			if (el.getText().equals("2")) {
				el.click();
			}
		}
		ArrayList<String> listOfTextViewSecondButton = new ArrayList<String>();
		ArrayList<String> listOfTextViewforComparingSecondButton = new ArrayList<String>();
		listOfTextViewSecondButton.add("Discover, discuss and");
		listOfTextViewSecondButton.add("vote on proposals");
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
		List<AndroidElement> alltextviewSecondButton = driver.findElements(By.className(widgetTextView));
		for (AndroidElement e : alltextviewSecondButton) {

			System.out.println(e.getText());
			listOfTextViewforComparingSecondButton.add(e.getText());
		}
		org.junit.Assert.assertEquals(listOfTextViewSecondButton, listOfTextViewforComparingSecondButton);
		System.out.println("second page is compared");

		List<AndroidElement> androidwidgetButtonThree = driver.findElements(By.className(widgetbutton));

		for (AndroidElement el : androidwidgetButtonThree) {
			if (el.getText().equals("3")) {
				el.click();
			}
		}
		ArrayList<String> listOfTextViewThirdButton = new ArrayList<String>();
		ArrayList<String> listOfTextViewforComparingThirdButton = new ArrayList<String>();
		listOfTextViewThirdButton.add("Pick a challenge and click on proposals to start exploring");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
		List<AndroidElement> alltextviewThirdButton = driver.findElements(By.className(widgetTextView));
		for (AndroidElement e : alltextviewThirdButton) {

			System.out.println(e.getText());
			listOfTextViewforComparingThirdButton.add(e.getText());
		}
		org.junit.Assert.assertEquals(listOfTextViewThirdButton, listOfTextViewforComparingThirdButton);
		System.out.println("third page is compared");
		
		List<AndroidElement> letsStartButton = driver.findElements(By.className("android.widget.Button"));
		

		for (AndroidElement k : letsStartButton) {
			if (k.getText().equals("LET'S START!")) {
				k.click();
				Thread.sleep(5000);
				break;
			}
		}
	}

	public AndroidDriver<AndroidElement> driverReturn() {
		System.out.println("return driver method");
		return (driver);
	}

	public void buttonSkip() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("***skip button method***");
		Reporter.log("skip button method ");
		AndroidElement buttonSkip = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		System.out.println(buttonSkip.getText());
		buttonSkip.click();

		Thread.sleep(1000);

	}

	public void checkNotifications() throws InterruptedException {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ArrayList<String> listOfTextViewforComparing = new ArrayList();
		ArrayList<String> listOfNotifications = new ArrayList();
		listOfNotifications.add("Notifications set up");
		listOfNotifications.add("Which notifications would you like to receive?");
		listOfNotifications.add("Voter notifications");
		listOfNotifications.add("Receive alerts for voting registration start and end dates plus other key dates");
		listOfNotifications.add("Proposer notifications");
		listOfNotifications.add("Receive alerts for submission deadlines and other key dates");
		listOfNotifications.add("Proposal Assessor notifications");
		listOfNotifications.add("Receive alerts for registration, reviewing start and end dates plus other key dates");
		listOfNotifications.add("You can change your notifications settings at any time.");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
		List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));

		for (AndroidElement el : alltextview) {
			Reporter.log(el.getText());
			System.out.println(el.getText());
			listOfTextViewforComparing.add(el.getText());
		}

		System.out.println("first list: ");
		listOfNotifications.forEach(System.out::println);
		System.out.println("second list: ");
		listOfTextViewforComparing.forEach(System.out::println);

		org.junit.Assert.assertEquals(listOfNotifications, listOfTextViewforComparing);
		System.out.println("notifications are as expected!***");
		Reporter.log("notifications are as expected!");
	}

	public void checkDashboard() throws InterruptedException {
		// Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ArrayList<String> listOfDashboardsTextViewforComparing = new ArrayList();
		ArrayList<String> listOfDashboardTextViews = new ArrayList();

		Thread.sleep(2000);

		ArrayList<String> listOfTextViewforComparing = new ArrayList();
		ArrayList<String> listOfTextView = new ArrayList();
		listOfTextView.add("Fund9");
		listOfTextView.add("Welcome to Catalyst!");
		listOfTextView.add("Your votes decide which project ideas get funding to solve real world problems.");
		listOfTextView.add("To vote, please CONNECT A REGISTERED WALLET.");
		listOfTextView.add("Take a look at the Voter Guide!");
		listOfTextView.add("Voting Power");
		// listOfTextView.add(
		// "Voting power comes from the balance snapshot Aug 4th, 2022 11:00 UTC and
		// will display how much Voting Power you have only once voting starts.");
		listOfTextView.add("How does it work?");
		// listOfTextView.add("Voting has started!");
		// listOfTextView.add("02 : 10 : 16 : 15");
		// listOfTextView.add("Majmun");
		listOfTextView.add("Dashboard");
		listOfTextView.add("Proposals");
		listOfTextView.add("My Selection");
		listOfTextView.add("Cast Votes");
		listOfTextView.add("Help & Support");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.TextView")));
		List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));

		for (AndroidElement el : alltextview) {
			Reporter.log(el.getText());
			System.out.println(el.getText());
			listOfTextViewforComparing.add(el.getText());
		}

		System.out.println("first list: ");
		listOfTextView.forEach(System.out::println);
		System.out.println("second list: ");
		listOfTextViewforComparing.forEach(System.out::println);

		boolean a;
		a = listOfTextViewforComparing.containsAll(listOfTextView);
		if (a) {
			System.out.println(a);
			System.out.println("Dashboard has all text as expected!***");
			Reporter.log("Dashboard has all text as expected!");
		} else {
			System.out.println("Dashboard has нот all text as expected!***");
			Reporter.log("Dashboard has not all text as expected!");
			assert false;
		}
	}

	public void votingHasStarted() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement votingHasStartded = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Voting has started!']"));
		boolean startedVoting = false;
		if (votingHasStartded.isDisplayed()) {
			startedVoting = true;
		} else {
			assert false;
		}

	}

	// org.junit.Assert.assertEquals(listOfTextView, listOfTextViewforComparing);
	// System.out.println("Dashboard has all text as expected!***");
	// Reporter.log("Dashboard has all text as expected!");

	public void goInProposal() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement goToProposal = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[2]"));
		goToProposal.click();

		List<AndroidElement> vrfProposal = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement vrfProp : vrfProposal) {

			System.out.println(vrfProp.getText());
			if (vrfProp.getText().equals("Proposals")) {
				assertEquals(vrfProp.getText(), "Proposals");
				System.out.println("Proposals is opened");
				Reporter.log("Proposals is opened");
				break;
			}
			Thread.sleep(3000);
		}
	}

	public void goCastVotes() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement goToCastVoites = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[4]"));
		goToCastVoites.click();

		Thread.sleep(3000);

		List<AndroidElement> verifyCastVotes = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement vrfcstVotes : verifyCastVotes) {

			System.out.println(vrfcstVotes.getText());
			if (vrfcstVotes.getText().equals("Cast Votes")) {
				assertEquals(vrfcstVotes.getText(), "Cast Votes");
				System.out.println("View Cast Votes is visible");
				Reporter.log("View Cast Votes is visible");
				break;

			}
			Thread.sleep(3000);
		}
	}

	public void goHelpAndSupport() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement goHelpAndSupport = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[5]"));
		goHelpAndSupport.click();

		Thread.sleep(2000);

		List<AndroidElement> verifyHelpAndSupport = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement vrfcstVotes : verifyHelpAndSupport) {

			System.out.println(vrfcstVotes.getText());
			if (vrfcstVotes.getText().equals("Help & Support")) {
				assertEquals(vrfcstVotes.getText(), "Help & Support");
				System.out.println("View Help & Support is visible");
				Reporter.log("View Help & Support is visible");
				break;
			}
			Thread.sleep(2000);
		}

		List<AndroidElement> goBack = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement gobck : goBack) {

			System.out.println(gobck.getText());
			if (gobck.getText().equals("Back")) {
				gobck.click();
				System.out.println("test is out of Help and Support");
				Reporter.log("Тest is out of Help and Support");
				break;

			}
			Thread.sleep(3000);
		}
	}

	public void goMySelection() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement goToProposal = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View[3]"));
		goToProposal.click();

		List<AndroidElement> verifyMySelection = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement vrfmysel : verifyMySelection) {

			System.out.println(vrfmysel.getText());
			if (vrfmysel.getText().equals("My Selection")) {
				assertEquals(vrfmysel.getText(), "My Selection");
				System.out.println("View My Selection is visible");
				Reporter.log("View My Selection is visible");
				break;
			}
			Thread.sleep(2000);
		}

		List<AndroidElement> goBack = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement gobck : goBack) {

			System.out.println(gobck.getText());
			if (gobck.getText().equals("Back")) {
				gobck.click();
				System.out.println("Тest is out of My Selection");
				Reporter.log("Тest is out of My Selection");
				break;

			}
			Thread.sleep(2000);
		}
	}

	public void enrollButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<AndroidElement> allButtons = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : allButtons) {

			System.out.println(el.getText());
			if (el.getText().equals("ENROLL TO RECEIVE NOTIFICATIONS")) {
				Thread.sleep(2000);
				el.click();
				Thread.sleep(2000);
			}
		}
		int i = 0;
		int j = 0;
		for (i = 0; i < 15 && j != 10; i++) {
			Thread.sleep(1000);
			System.out.println(i);
			List<AndroidElement> alltextview = driver.findElements(By.className("android.widget.TextView"));
			for (AndroidElement elem : alltextview) {
				// System.out.println(i);
				System.out.println(elem.getText());
				if (elem.getText().equals("Fund9")) {
					// System.out.println("Test is in ENROLL or loader is still visible!");
					j = 10;

				}

			}

		}
	}

	public void closePopup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<AndroidElement> closepopup = driver.findElements(By.className("android.widget.Image"));
		for (AndroidElement el : closepopup) {

			System.out.println(el.getText());
			if (el.getText().equals("notifications icon")) {
				el.click();
				System.out.println("Popup is moved");
				Reporter.log("Popup is moved");
				break;
			}
			// break;
			// Thread.sleep(1000);
		}
	}

	public void dotInPin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<AndroidElement> enterPinFieds = driver.findElements(By.className("android.widget.EditText"));
		int i = 1;
		int j = 2;
		for (AndroidElement el : enterPinFieds) {

			System.out.println(i);
			el.click();
			Thread.sleep(1000);
			el.sendKeys(String.valueOf(j));
			i = i + 1;
			Thread.sleep(1000);
			if (i == 4) {
				el.sendKeys(String.valueOf(56));
				// break;
			}

		}
		Thread.sleep(1000);
		AndroidElement confirm = driver.findElement(By.className("android.widget.Button"));
		if (!confirm.isEnabled()) {
			System.out.println("Confirm is not enabled");
			Reporter.log("Confirm is not enabled");
			assert true;
		}

		Thread.sleep(2000);
	}

	public void goodPinAndHash() throws InterruptedException {
		SecretsKeys key = new SecretsKeys();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement scanAnotherQrOrHash = driver
				.findElement(By.xpath("//android.widget.Button[@text='SCAN ANOTHER QR CODE OR HASH']"));
		scanAnotherQrOrHash.click();
		Thread.sleep(1000);
		AndroidElement yoroi = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"));
		yoroi.click();

		Thread.sleep(1000);

		System.out.println("Yoroi mobile is clicked!");
		Reporter.log("Yoroi mobile is clicked!");

		AndroidElement readyToPasteHashButton = driver
				.findElement(By.xpath("//android.widget.Button[@text='I’M READY TO PASTE MY HASH CODE']"));
		readyToPasteHashButton.click();
		System.out.println("Ready to paste hash code is clicked!");
		Reporter.log("Ready to paste hash code is clicked!");

		Thread.sleep(1000);

		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.walletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath("//android.widget.Button[@text='CONFIRM']"));

		confirmButton.click();

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
		AndroidElement confirm = driver.findElement(By.xpath("//android.widget.Button[@text='CONFIRM']"));
		confirm.click();
		Thread.sleep(2000);
		AndroidElement got = driver.findElement(By.className("android.widget.Button"));
		got.click();
		Thread.sleep(1000);
		Boolean walletConected = driver.findElement(By.xpath("//android.widget.TextView[@text='Wallet connected!']"))
				.isDisplayed();
		if (!walletConected) {
			assert false;
		}

		Thread.sleep(2000);

	}

	public void IncompleteConnection() throws InterruptedException {
		SecretsKeys key = new SecretsKeys();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement backButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Back']"));
		backButton.click();
		Thread.sleep(1000);
		backButton.click();
		System.out.println("Back button is clicked!");
		Thread.sleep(8000);
		List<AndroidElement> alltextOnScreen1 = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextOnScreen1) {
			System.out.println(el.getText());

		}

		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.walletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath("//android.widget.Button[@text='CONFIRM']"));

		confirmButton.click();

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
		AndroidElement confirm = driver.findElement(By.xpath("//android.widget.Button[@text='CONFIRM']"));
		confirm.click();
		Thread.sleep(2000);
		Boolean walletConected = driver.findElement(By.xpath("//android.widget.TextView[@text='Wallet connected!']"))
				.isDisplayed();
		if (walletConected) {
			assert true;
		}
		AndroidElement got = driver.findElement(By.xpath("//android.widget.Button[@text='GOT IT']"));
		got.click(); // moving pop up
		Thread.sleep(1000);
		got.click(); // another click without pop up
		Thread.sleep(2000);
		AndroidElement incompleteMessage = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Connection Unsuccessful!']"));
		if (!incompleteMessage.isDisplayed()) {
			assert false;
		}

		Thread.sleep(2000);

	}

	public void ConnectWallet() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SecretsKeys key = new SecretsKeys();
		// Thread.sleep(3000);
		System.out.println("ConnectWallet method");
		Reporter.log("Connect Wallet method");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(5000);

		List<AndroidElement> conButtons = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : conButtons) {

			System.out.println(el.getText());
			if (el.getText().equals("CONNECT WALLET")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("wallet is clicked");
				Reporter.log("wallet is clicked");
			}
			Thread.sleep(2000);
		}

		Thread.sleep(1000);

		List<AndroidElement> allButtonsList = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : allButtonsList) {
			System.out.println("All visible buttons!");
			System.out.println(el.getText());
			System.out.println("All visible buttons finish in iteration!");
		}

		AndroidElement yoroi = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"));
		yoroi.click();

		Thread.sleep(1000);

		System.out.println("Yoroi mobile is clicked!");
		Reporter.log("Yoroi mobile is clicked!");

		List<AndroidElement> alltextOnScreen = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : alltextOnScreen) {
			System.out.println(el.getText());
			if (el.getText().equals("I'M READY TO PASTE MY HASH CODE")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("CLICKED ON READY TO PASTE");
				Reporter.log("CLICKED ON READY TO PASTE!");
			}

		}

		AndroidElement readyToPasteHC = driver.findElement(By.xpath(readyToPaste));
		readyToPasteHC.click();
		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.walletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button"));
		confirmButton.click();
		List<AndroidElement> alltextOnScreen1 = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextOnScreen1) {
			System.out.println(el.getText());
			Reporter.log(el.getText());
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

		List<AndroidElement> walletConectedTexts = driver.findElements(By.className("android.widget.TextView"));

		for (AndroidElement el : walletConectedTexts) {
			System.out.println(el.getText());
			Reporter.log(el.getText());

		}
		// got.click();
		Thread.sleep(5000);
		// return(driver);
		// Invoke driver.quit() after the test is done to indicate that the test is
		// completed.
		// driver.quit();
	}

	public void wrongWalletHash() throws InterruptedException {
		SecretsKeys key = new SecretsKeys();
		AndroidElement backButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Back']"));
		backButton.click();
		System.out.println("Back button is clicked!");
		// Thread.sleep(3000);
		System.out.println("Connect Wallet Incomplete method");
		Thread.sleep(2000);

		// Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// AndroidElement readyToPasteHC = driver.findElement(By.xpath("\r\n"
		// +
		// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
		// readyToPasteHC.click();
		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.wrongwalletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath("//android.widget.Button[@text='CONFIRM']"));

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
		if (confirm.isDisplayed()) {
			System.out.println("Confirm is still visible");
			Reporter.log("Confirm is still visible");
			assert true;
		}

	}

	public void qRCode() throws InterruptedException {

		System.out.println("QR Code Test");
		Reporter.log("QR Code Test");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);

		List<AndroidElement> conButtons = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : conButtons) {

			System.out.println(el.getText());
			if (el.getText().equals("CONNECT WALLET")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("Wallet is clicked");
				Reporter.log("Wallet is clicked");
			}
			Thread.sleep(3000);
		}

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AndroidElement qRCode = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[1]"));
		qRCode.click();
		System.out.println("QR Code is clicked!");
		Reporter.log("QR Code is clicked");

		Thread.sleep(1000);

		AndroidElement readyToScan = driver
				.findElement(By.xpath("//android.widget.Button[@text='I’M READY TO SCAN MY QR CODE']"));
		readyToScan.click();
		Thread.sleep(1000);

		/*
		 * AndroidElement onlyThisTime = driver
		 * .findElement(By.xpath("//android.widget.Button[@text='Only this time']"));
		 * onlyThisTime.click();
		 */
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		AndroidElement backButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Back']"));
		backButton.click();

	}

	public void wrongPin() throws InterruptedException {
		SecretsKeys key = new SecretsKeys();
		// Thread.sleep(3000);
		System.out.println("Wrong Pin Test");
		Reporter.log("Wrong Pin Test");

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		AndroidElement yoroi = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"));
		yoroi.click();
		// WebDriverWait waitme;

		Thread.sleep(1000);

		System.out.println("Yoroi mobile is clicked!");
		Reporter.log("Yoroi mobile is clicked");

		List<AndroidElement> alltextOnScreen = driver.findElements(By.className("android.widget.Button"));
		for (AndroidElement el : alltextOnScreen) {
			System.out.println(el.getText());
			if (el.getText().equals("I'M READY TO PASTE MY HASH CODE")) {
				Thread.sleep(2000);
				el.click();

				System.out.println("CLICKED ON READY TO PASTE");
				Reporter.log("CLICKED ON READY TO PASTE");
			}

		}

		AndroidElement readyToPasteHC = driver.findElement(By.xpath("\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.Button"));
		readyToPasteHC.click();
		AndroidElement editText = driver.findElement(By.className("android.widget.EditText"));
		editText.sendKeys(key.wrongwalletkey);
		AndroidElement confirmButton = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button"));
		confirmButton.click();
		List<AndroidElement> alltextOnScreen1 = driver.findElements(By.className("android.widget.TextView"));
		for (AndroidElement el : alltextOnScreen1) {
			System.out.println(el.getText());
			Reporter.log(el.getText());

		}
		List<AndroidElement> enterPinFieds = driver.findElements(By.className("android.widget.EditText"));
		int i = 1;
		int j = 2;
		for (AndroidElement el : enterPinFieds) {

			System.out.println(i);
			el.click();
			Thread.sleep(1000);
			el.sendKeys(String.valueOf(j));
			i = i + 1;
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		AndroidElement confirm = driver.findElement(By.className("android.widget.Button"));
		confirm.click();
		Thread.sleep(2000);
		if (confirm.isDisplayed()) {
			System.out.println("Confirm is still visible");
			Reporter.log("Confirm is still visible");
			assert true;
		}

	}
}

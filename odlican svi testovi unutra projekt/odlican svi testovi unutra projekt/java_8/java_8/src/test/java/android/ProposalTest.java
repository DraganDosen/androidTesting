package android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Pages.DashboardPage;
import Pages.ProposalPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ProposalTest {
	AndroidDriver<AndroidElement> driver;

	@Test(priority = 0)

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
		caps.setCapability("name", "Proposal Test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> drivers = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		System.out.println("proposal test: ");
		driver = drivers;
	}

	@Test(priority = 1, description = "Scrolling First Page test")
	@Severity(SeverityLevel.CRITICAL)
	public void scrollingFirstPageTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.scrollingFirstPage();
		dp.driverReturn();
	}

	@Test(priority = 2, description = "Check notifications")
	@Severity(SeverityLevel.CRITICAL)
	public void checkNotificationsTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.checkNotifications();
		dp.driverReturn();
	}

	@Test(priority = 3, description = "Enroll button test")
	@Severity(SeverityLevel.CRITICAL)
	public void enrollButtonTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.enrollButton();
		dp.driverReturn();
	}

	@Test(priority = 4, description = "Close Pop Up  test")
	@Severity(SeverityLevel.CRITICAL)
	public void closePopUpTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.closePopup();
		dp.driverReturn();
	}

	@Test(priority = 5, description = "Dashboard test")
	@Severity(SeverityLevel.CRITICAL)
	public void dashboardTest() throws InterruptedException {
		DashboardPage dp = new DashboardPage(driver);

		dp.checkDashboard();
		dp.driverReturn();
	}

	@Test(priority = 6, description = "Voting has started")
	@Severity(SeverityLevel.NORMAL)
	public void votingHasStarted() throws InterruptedException {
		DashboardPage dashboardPageObj = new DashboardPage(driver);

		dashboardPageObj.votingHasStarted();
		dashboardPageObj.driverReturn();
	}

	@Test(priority = 7, description = "Go to proposal")
	@Severity(SeverityLevel.CRITICAL)
	public void goToProposalTest() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.goInProposal();
		proposalPageObj.driverReturn();
	}

	@Test(priority = 8, description = "Minimal number 3 letter for search Challenges")
	@Severity(SeverityLevel.NORMAL)
	public void minThreeLettersForSearchChallengesTest() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.minThreeLettersForSearchChallenges();
		proposalPageObj.driverReturn();
	}

	@Test(priority = 9, description = "Search Challenges")
	@Severity(SeverityLevel.NORMAL)
	public void searchChallengesTest() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.searchChallenges();
		proposalPageObj.driverReturn();
	}

	@Test(priority = 10, description = "Search Proposals")

	@Severity(SeverityLevel.CRITICAL)
	public void searchProposal() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.searchProposal();
		proposalPageObj.driverReturn();

	}

	@Test(priority = 11, description = "Filtering in Proposals")
	@Severity(SeverityLevel.CRITICAL)
	public void proposalFiltering() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.proposalFiltering();
		proposalPageObj.driverReturn();

	}

	@Test(priority = 12, description = "User cannot move left and right")
	@Severity(SeverityLevel.CRITICAL)
	public void userCannotMoveLeftAndRight() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.oneProposalCannotMoveLeftAndRight();
		proposalPageObj.driverReturn();

	}

	@Test(priority = 13, description = "Only Yes or No Vote Posibility")
	@Severity(SeverityLevel.CRITICAL)
	public void userCanVoteOnlyYesOrNo() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.userCanVoteYesOrNo();
		proposalPageObj.driverReturn();

	}

	@Test(priority = 14, description = "User can back to challenge")
	@Severity(SeverityLevel.CRITICAL)
	public void backToChallenge() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.backToChallenge();
		proposalPageObj.driverReturn();
	}

	@Test(priority = 15, description = "Clear Filter")
	@Severity(SeverityLevel.CRITICAL)
	public void clearFilter() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.clearFilter();
		proposalPageObj.driverReturn();
	}

	@Test(priority = 16, description = "User can move left and right")
	@Severity(SeverityLevel.CRITICAL)
	public void userCanMoveLeftAndRightInProposals() throws InterruptedException {
		ProposalPage proposalPageObj = new ProposalPage(driver);

		proposalPageObj.moreProposalsCanMoveLeftAndRight();
		proposalPageObj.driverReturn();
		driver.quit();
	}

}

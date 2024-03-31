package android;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.BlazeFindAndPurchase;
import Pages.LoginParamBlaze;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BlazeFindAndPurchaseTest {
	
	@BeforeTest

    public void setup(){
    }
     
       
    @Test(priority=0)

    public void test_Find_Purchase(){
    	//WebDriverManager.edgedriver().setup();
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\draga\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	//EdgeOptions edgeOptions = new EdgeOptions();
    	WebDriver driver = new EdgeDriver();
	    //WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();


    
       LoginParamBlaze logObj = new LoginParamBlaze();
	   
	   BlazeFindAndPurchase objFindandPurchase = new BlazeFindAndPurchase(driver);
	   objFindandPurchase.clickLoginButtton();
	   System.out.println("***login method***");
	   objFindandPurchase.loginToDemoBlaze(logObj.username,logObj.password);
	   System.out.println("***clickLabtops method***");
	   objFindandPurchase.clickLabtops();
	   System.out.println("***findProduct method***");
	   objFindandPurchase.findProduct();
	   System.out.println("***goToChart method***");
	   objFindandPurchase.goToChart();
	   System.out.println("***LogOut method***");
	   objFindandPurchase.logOut();
	   System.out.println("***Verify LogOut method***");
	   objFindandPurchase.verifyLogOut();
	
        driver.quit();
    }                                               


}

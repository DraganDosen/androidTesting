package Pages;
import org.openqa.selenium.By;
import org.testng.Reporter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

public class BlazeFindAndPurchase {
	
	 WebDriver driver;
	    
	    By login = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
	 
	    By loginButton = By.id("login2");
	    
	    By userName = By.id("loginusername");

	    By password = By.id("loginpassword");

	    By titleText =By.className("barone");

	    By addtochart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	  
	    
	    By loginName = By.id("nameofuser");
	    By Next = By.xpath("//*[@id=\"next2\"]");


	    public BlazeFindAndPurchase(WebDriver driver){

	        this.driver = driver;
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    }
	    //Set username in username textbox
		
        public void setUserName(String strUserName){
	        Reporter.log("Set Username");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	wait1.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(strUserName);
	    	
            }
	  

	    //Set password in password textbox

	    public void setPassword(String strPassword){
	    	 Reporter.log("Set Password");
	         WebDriverWait wait1 = new WebDriverWait(driver, 10);
	         wait1.until(ExpectedConditions.elementToBeClickable(By.id("loginpassword")));
             wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword"))).sendKeys(strPassword);
	        }

	    //Click on login button
	    
	    public void clickLoginButtton(){
	    	 
	    	
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	
	        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("login2")));
	    	
            driver.findElement(loginButton).click();

    }

	    public void clickLogin(){

	            driver.findElement(login).click();

	    }

	    public void loginToDemoBlaze(String strUserName,String strPasword){
		    
		      
		        //Fill user name
		    
		        this.setUserName(strUserName);

		        //Fill password

		        this.setPassword(strPasword);

		        //Click Login button
		       // this.clickLoginButtton();

		        this.clickLogin();        
		    }
	    public void clickLabtops() {
	    	 Reporter.log("Click on Labtops");

	    	 try {
	    	        Thread.sleep(20*100);
	    	    } catch (InterruptedException e) {
	    	        e.printStackTrace();
	    	    }
	    	 List<WebElement> listOfelements = driver.findElements(By.xpath("//*[@href]"));
	    	 for (WebElement webElement : listOfelements) {
	                    
	             if (webElement.getText().contains("Laptops"))
	             
	                {
	            	 System.out.println("Labtops is found");
	            	 webElement.click();
	            	 System.out.println("Labtops is clicked");
	            	 break;
	                }
	             else 
	               { 
	            	 System.out.println(webElement.getText());
	            	 
	               }
	    	 }
	    }
	    
	    
	    public void findProduct(){
	    	Reporter.log("Find Dell device");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]")));
	    	 try {
	    	        Thread.sleep(20*100);
	    	    } catch (InterruptedException e) {
	    	        e.printStackTrace();
	    	    }
	    	
	    	List<WebElement> listOfProducts = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]")).findElements(By.xpath("//*[@href]"));
	    		    
	    		    
	         int rows = listOfProducts.size();
	         System.out.println(rows);
	         for (WebElement dell : listOfProducts) {
	           
	             if (dell.getText().contains("2017 Dell 15.6 Inch"))
	             
	                {
	            	 System.out.println("dell is found");
	            	 dell.click();
	            	 System.out.println("webelement is clicked");
	            	 driver.findElement(addtochart).click();
	            	 System.out.println("dell is at chart");
	            	 try {
	 	    	        Thread.sleep(20*100);
	 	    	    } catch (InterruptedException e) {
	 	    	        e.printStackTrace();
	 	    	    }
	            	 String alertText= driver.switchTo().alert().getText();	
	     	    	Assert.assertTrue(alertText.contains("Product added"));
	     	    	System.out.println(alertText);
	     	    	driver.switchTo().alert().accept();
	     
	     	    	break;
	                }
	             else 
	               { 
	            	 System.out.println(dell.getText()); 
	               }
	          
	           
	         }
	         
	         }
	    
	    public void handleAlert (){
		    
		       // LoginParam logObj= new LoginParam();
		        //Fill user name
		    	//System.out.println("2");
	    	String alertText= driver.switchTo().alert().getText();	
	    	System.out.println(alertText);
	    	//Assert.assertTrue(alertText.contains("Product added."));
	    	
	    	driver.switchTo().alert().accept();
	    	
      
		    }
	    public void goToChart(){
		    
	    	Reporter.log("Go to chart");
	    	System.out.println("go to chart");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	System.out.println("wait for element is visible");
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cartur\"]"))).click();
	        	System.out.println("Chart is opened");
	        	
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"))).click();
	        	System.out.println("Place order button is clicked");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"name\"]"))).sendKeys("name");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"country\"]"))).sendKeys("country");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"city\"]"))).sendKeys("city");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"card\"]"))).sendKeys("credit card");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"month\"]"))).sendKeys("month");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"year\"]"))).sendKeys("year");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"))).click();
	        	System.out.println("Product is purchased");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]/div[7]/div/button"))).click();
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]"))).click();
	        	
	        	
	        	
		    }

	    public void logOut(){
		    
		       // LoginParam logObj= new LoginParam();
		        //Fill user name
		    	//System.out.println("2");
	    	Reporter.log("Log Out");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);

	    	 try {
	    	        Thread.sleep(20*100);
	    	    } catch (InterruptedException e) {
	    	        e.printStackTrace();
	    	    }
	    	 List<WebElement> logout = driver.findElements(By.xpath("//*[@href]"));
	    	 for (WebElement webElement : logout) {
	                    
	             if (webElement.getText().contains("Log out"))
	             
	                {
	            	 
	            	 webElement.click();
	            	 break;
	                }
	    	                                       }
	        }
	    
	    	   public void verifyLogOut(){
	   		    
			       // LoginParam logObj= new LoginParam();
			        //Fill user name
			    	//System.out.println("2");
		    	Reporter.log("Verify Log Out");
		    	WebDriverWait wait1 = new WebDriverWait(driver, 10);

		    	 try {
		    	        Thread.sleep(20*100);
		    	    } catch (InterruptedException e) {
		    	        e.printStackTrace();
		    	    }
		    	 List<WebElement> login = driver.findElements(By.xpath("//*[@href]"));
		    	 for (WebElement webElement : login) {
		    		 String Text= webElement.getText();
		 	    	System.out.println(Text);
		             if (webElement.getText().contains("Log in"))
		             
		                {
		            	 break;
		                }
		            
		    }
		    
	        	
	        	
		    }

}




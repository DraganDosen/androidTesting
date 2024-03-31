package Pages;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;



public class  BlazeLogin  {
    WebDriver driver;
    
    By loginButton = By.id("login2");
    
    By userName = By.id("loginusername");

    By password = By.id("loginpassword");

    By titleText =By.className("barone");

    By login = By.xpath("/html/body/div[3]/div/div/div[3]/button[2]");
    
    By loginName = By.id("nameofuser");


    public BlazeLogin(WebDriver driver){

        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
   

	 

	    //Set user name in textbox

	    public void setUserName(String strUserName){
	    	
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(strUserName);
	    	
            }
	  

	    //Set password in password textbox

	    public void setPassword(String strPassword){

	         WebDriverWait wait1 = new WebDriverWait(driver, 10);
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

	    //Get the title of Login Page

	    public String getLoginTitle(){

	     return    driver.findElement(titleText).getText();

	    }

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */
	  
	    public void loginToDemoBlaze(String strUserName,String strPasword){
	    
	      
	    	Reporter.log("Login to store");
	    	
			//Fill username
	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button
	       // this.clickLoginButtton();

	        this.clickLogin();        
	    }
	    public void checkIsLogged(String strUserName){
		    
	    	Reporter.log("Check is logged");
	    	
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	  
	    	String logedUser=	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))).getText();
	        	
		    	System.out.println(logedUser);
		    	System.out.println(strUserName);
	    	Assert.assertTrue(logedUser.contains(strUserName ));
	    	
	    	
               
		       
		    }
	    public void clickLabtops() {
	    	Reporter.log("Click on Labtops");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);

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
	    
	    public void findLenovo(){
	    	Reporter.log("Find Lenovo");
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
	         for (WebElement lenovo : listOfProducts) {
	           
	             if (lenovo.getText().contains("Lenovo"))
	             
	                {
	            	 System.out.println("Lenovo is found");
	            	 lenovo.click();
	            	 System.out.println("webelement is clicked");
	            	 try {
	 	    	        Thread.sleep(20*100);
	 	    	    } catch (InterruptedException e) {
	 	    	        e.printStackTrace();
	 	    	    }
	     	    	break;
	                }
	             else 
	               { 
	            	 System.out.println(lenovo.getText()); 
	               }
	            }
	         
	         }
	    
	    
	    public void useContactForm(){
		    
	    	Reporter.log("Use contact form");
	    	System.out.println("Contact Form");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	System.out.println("ceka ime da se pojavi");
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"))).click();
	        	System.out.println("vidi se kontakt forma");
	        	
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recipient-email\"]"))).sendKeys("aaa@gmail.com");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"recipient-name\"]"))).sendKeys("name");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message-text\"]"))).sendKeys("there are not Lenovo laptop");
	        	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"))).click();
	        	
	    	
            
		       
		    }
	    public void handleAlert (){
		    
	    	Reporter.log("Handle alert");
	    	String alertText= driver.switchTo().alert().getText();	
	    	Assert.assertTrue(alertText.contains("Thanks for the message!!"));
	    	System.out.println(alertText);
	    	driver.switchTo().alert().accept();
	    	
         
		       
		    }
	    
	    public void checkAboutUs(){
		    
	    	Reporter.log("Check About us");
	    	System.out.println("method  checkAboutUs");
	    	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    	System.out.println("waiting for about us and click");
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About us"))).click();
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("videoModal"))).click();
	    	 try {
	    	        Thread.sleep(10*1000);
	    	    } catch (InterruptedException e) {
	    	        e.printStackTrace();
	    	    }
	    	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button"))).click();
	    	
	         }
	         
	      }
	    

	    
	



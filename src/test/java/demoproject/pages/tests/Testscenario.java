/**
 * 
 */
/**
 * @author muthukumar
 *
 */
package demoproject.pages.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import demoproject.pages.header.contact.contactPage;


public class Testscenario {

    private WebDriver driver;
    private contactPage page;

    @BeforeSuite
    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "/Users/muthukumar/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(" http://jupiter.cloud.planittesting.com");
        page = PageFactory.initElements(driver,contactPage.class);
    }
    @Test
    public void conditioncheck(){
        page.gotocontactform()
            .clickevent()
            
            .gotofillattribute()
            
            .fillform()
            .backflip();
           }
  
    
    @Test
    public void conditioncheck1(){
        page.gotocontactform()
            .invalidfillform();
                 
    }
    @Test
    public void conditioncheck2(){
        page
            
            .gotofillattribute()
            .fillform();
    }        
    
   
   
   /* @AfterMethod
    public void clearCookies(){
      //  driver.manage().deleteAllCookies();
    } */
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}

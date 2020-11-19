package demoproject.pages.header.inshop;
	
import demoproject.pages.header.contact.checkoutPage;
import demoproject.pages.header.contact.contactPage;
import demoproject.pages.header.inconduct.*;
import demoproject.pages.header.inshop.*;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.syed.madison_island.pages.ShoppingCartPage;

import selectors.shopLocators;


public class ShopdisplayPage {
	
		    private WebDriver driver;
		    private WebDriverWait wait;
		    private Actions actions;

		    //Planit page
		    @FindBy(how = How.XPATH,using = shopLocators.fluffyBunny)
		    WebElement bunny;
		    @FindBy(how = How.XPATH,using = shopLocators.FunnyCow)
		    WebElement FluCow;
		    @FindBy(how = How.XPATH, using = shopLocators.cartMenu)
		    WebElement cartitems;
		    @FindBy(how = How.XPATH,using = shopLocators.verifyforBunny)
		    WebElement firstitem;
		    @FindBy(how = How.XPATH,using = shopLocators.buyclick)
		    WebElement buy1;
		    @FindBy(how = How.XPATH,using = shopLocators.shopMenu)
		    WebElement shopButton;
		    
		    public ShopdisplayPage(WebDriver driver)
		    {
		    	 this.driver = driver;
			        wait = new WebDriverWait(driver,30,1000);

		    }
		    public checkoutPage addToys(){
		    	wait.until(ExpectedConditions.elementToBeClickable(shopButton));
		        shopButton.click();
		    	wait.until(ExpectedConditions.visibilityOf(buy1));
		        buy1.click();
		        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
		        return PageFactory.initElements(driver, checkoutPage.class);
		    }

		    

		    
		    
		  /*  // Returns pages in the Women Sections
		   public Homepage goTohomePage(){
		        wait.until(ExpectedConditions.elementToBeClickable(PageLink));
		        PageLink.click();
		        wait.until(ExpectedConditions.titleIs("We welcome your feedback - tell it how it is."));
		        return PageFactory.initElements(driver,Homepage.class);
		    }
		    public ContactformPage goTocontactPage(){
		        wait.until(ExpectedConditions.visibilityOf(PageLink));
		        actions.moveToElement(PageLink).build().perform();
		      /*  wait.until(ExpectedConditions.elementToBeClickable(blazers));
		        blazers.click();
		        wait.until(ExpectedConditions.titleIs("Blazers - Men")); 
		       // return PageFactory.initElements(driver, ContactformPage.class) 
		     */
		
}





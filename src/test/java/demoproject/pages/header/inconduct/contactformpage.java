package demoproject.pages.header.inconduct;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import demoproject.pages.header.contact.contactPage;
import selectors.ContactformLocators;
	

	
		public class contactformpage {
			
		private WebDriver driver;
	    private WebDriverWait wait;

	    public contactformpage(WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,30,1000);
	    }
	    @FindBy(how = How.XPATH,using = ContactformLocators.Name)
	    WebElement Fname;
	    @FindBy(how = How.XPATH,using = ContactformLocators.surname)
	    WebElement Sename;
	    @FindBy(how = How.XPATH,using = ContactformLocators.mailId)
	    WebElement Emailid;
	    @FindBy(how = How.XPATH,using = ContactformLocators.phoneNo)
	    WebElement Phonenumber;
	    @FindBy(how = How.XPATH,using = ContactformLocators.message)
	    WebElement messge;
	    @FindBy(how = How.XPATH,using = ContactformLocators.submitbutton)
	    WebElement submit;
	    @FindBy(how = How.XPATH,using = ContactformLocators.confirmationpageTitle)
	    WebElement titleinfor;
	    @FindBy(how = How.XPATH,using = ContactformLocators.backbutton)
	    WebElement backpress;
	    @FindBy(how = How.XPATH,using = ContactformLocators.alertmsg)
	    String alertmsgapp;
	    
	    
	    
   
	    public contactPage clickevent(){
	        wait.until(ExpectedConditions.visibilityOf(submit));
	        submit.click();
	        System.out.println("alert");
	        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
	        return PageFactory.initElements(driver, contactPage.class);
	    }
	    public contactPage backflip(){
	        wait.until(ExpectedConditions.visibilityOf(backpress));
	        backpress.click();
	        //assertEquals(titleinfor.getText().toLowerCase(), "We welcome your feedback");
	        return PageFactory.initElements(driver, contactPage.class);
	    }
	     public contactPage fillform()
	     {
              fillformWithdetails("Fina", "Selenium", "Fina@Selenium.com", "0233334545",
                "NYC");
        return PageFactory.initElements(driver, contactPage.class);
          } 
	     public contactPage invalidfillform()
	     {
              fillformWithdetails("1234", "3455", "1234Selenium.com", "abcd",
                "fillinuppercase");
        return PageFactory.initElements(driver, contactPage.class);
          } 

		public void fillformWithdetails(String Firstname, String Secondname, String Email,
				String phonentt, String messages1) {
			// TODO Auto-generated method stub
			
			 
		        wait.until(ExpectedConditions.elementToBeClickable(Fname));
		        Fname.clear();
		        Fname.sendKeys(Firstname);
		        
		        Sename.clear();
		        Sename.sendKeys(Secondname);
		        wait.until(ExpectedConditions.visibilityOf(Emailid));
		        Emailid.clear();
		        Emailid.sendKeys(Email);
		        Phonenumber.clear();
		        Phonenumber.sendKeys(phonentt);
		        messge.clear();
		        messge.sendKeys(messages1);
		        submit.click();
		        //String text=alertmsgapp.getText();
		        String expectedText = "We are Welcome";
		       
		       /* String text= alertmsgapp;
		        if (text.contains("We are Welcome"))
		        { 
		            System.out.println("Successfully completed");
		        }else{
		            System.out.println("Please enter all details");
		        }   */   

		      
		} 
		


	}







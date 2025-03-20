package cyclos_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration {
	public WebDriver driver;  
	public Registeration(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//div[text()=' Register ']")
	WebElement linkCreateAnAccount;
	
	@FindBy (xpath= "//input[@autocomplete='off']")
	WebElement txtFirstName;
	
	@FindBy (xpath="(//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid'])[1]")
	WebElement txtLoginName;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[3]")
	WebElement txtemailAddress;
	
	@FindBy (xpath="(//button[@type='button'])[9]")
	WebElement btnNext;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	WebElement txtPassword;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	WebElement txtCPassword;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
//	3 Create an action
	
	public void createAnAccountLink() {
		linkCreateAnAccount.click();
	}
	
	public void setFirstName() {
		txtFirstName.sendKeys("jack");
	}
	
	public void setLoginName() {
		txtLoginName.sendKeys("jack132");
	}
	
	public void setEmailAddress() {
		txtemailAddress.sendKeys("jack13@gmail.com");
	}

	
	public void clickButton() {
		btnNext.click();
	}
	public void setpassword() {
		txtPassword.sendKeys("jack@123");
	}
	
	public void setconfirmpassword() {
		txtCPassword.sendKeys("jack@123");
	}
	
	public void clickcheckbox() {
		checkbox.click();
	}
	public void submitButton() {
		submit.click();
	}

}

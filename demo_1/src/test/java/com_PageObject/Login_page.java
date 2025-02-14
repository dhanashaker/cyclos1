package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
	public Login_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Login;

	public void setusername() {
		username.sendKeys("Anwesh26");
	}
	public void setpassword() {
		Password.sendKeys("anwesh26#");
	}
	public void setlogin() {
		Login.click();
	}
}

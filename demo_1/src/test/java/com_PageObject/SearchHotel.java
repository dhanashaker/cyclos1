package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	public WebDriver driver;
	public Select sc;
public SearchHotel(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="location")
WebElement location;

@FindBy(id="room_nos")
WebElement Rooms;

@FindBy(id="datepick_in")
WebElement Date_in;

@FindBy(id="datepick_out")
WebElement Date_out;

@FindBy(id="adult_room")
WebElement Adult;

@FindBy(id="Submit")
WebElement Search;

public void setlocation() {
	sc=new Select(location);
	sc.selectByIndex(0);
}
public void setRooms()
{
	sc=new Select(Rooms);
	sc.selectByIndex(2);
}
public void setDateIn()
{
	Date_in.sendKeys("26/09/2025");
}
public void setDateOut()
{
	Date_out.sendKeys("27/09/2025");
}
public void setAdultRoom()
{
	sc=new Select(Adult);
	sc.selectByIndex(2);
}
public void SearchBtn()
{
	Search.click();
}


}

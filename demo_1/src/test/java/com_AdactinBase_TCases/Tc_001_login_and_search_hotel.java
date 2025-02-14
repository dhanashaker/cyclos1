package com_AdactinBase_TCases;

import org.testng.annotations.Test;

import com_PageObject.Login_page;
import com_PageObject.SearchHotel;

public class Tc_001_login_and_search_hotel extends Bases_Class {
	
	public Login_page LP;
	public SearchHotel SH;
	
	@Test
	public void searchhotel(){
		LP = new Login_page(driver);
		LP.setusername();
		LP.setpassword();
		LP.setlogin();
		
		SH = new SearchHotel(driver);
		SH.setlocation();
		SH.setRooms();
		SH.setDateIn();
		SH.setDateOut();
		SH.setAdultRoom();
		SH.SearchBtn();
	}

}

package cyclos_BaseTCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import cyclos_PageObject.Registeration;

public class TC_01_Registeration extends Cyclos_BaseClass{
	
	@Test
	public void Registeration_Cyclos() throws Exception {
		Registeration cr = new Registeration(driver);
		cr.createAnAccountLink();
		
		cr.setFirstName();
		
		cr.setLoginName();
		
		cr.setEmailAddress();
		
		
		cr.clickButton();
		
		cr.setpassword();
		
		cr.setconfirmpassword();
		
		cr.clickcheckbox();
		Thread.sleep(5000);
		cr.submitButton();
		Thread.sleep(3000);
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Java\\Cyclos\\Screen\\Cyclos.png");
		FileUtils.copyFile(src,trg);
		
		
		
	}
}


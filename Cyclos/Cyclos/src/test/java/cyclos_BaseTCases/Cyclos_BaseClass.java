package cyclos_BaseTCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Cyclos_BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass 
	@Parameters({"browser","url"})
	
	public void openapplication(String br,String url) {
		
		if(br.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(br.equals("Firefox")){
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
/*	@AfterClass
	public void Closeapplication() {
		driver.close();
	}*/

}

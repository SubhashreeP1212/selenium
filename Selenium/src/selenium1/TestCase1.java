package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestCase1 {
	
	public static void main(String args [])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver;
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("Platform", org.openqa.selenium.Platform.ANY);
		
		
		driver =new FirefoxDriver(options);
		System.out.println("test");
		driver.get("https://www.amazon.com/ap/signin?accountStatusPolicy=P1&clientContext=258-6226740-0881525&language=en_US&openid.assoc_handle=amzn_prime_video_desktop_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fref%253Ddv_auth_ret");
	    driver.findElement(By.name("email")).sendKeys("8697460577");
	    driver.findElement(By.name("password")).sendKeys("Enterprise1!");
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    /*String url = driver.getCurrentUrl();
	    
	    if (url.equals("http://www.gcrit.com/build3/admin/index.php")) {
	    	System.out.println("login successfull.passed");
	    }
	    	else {
	    		System.out.println("login unsuccessfull.failed");
	    	} */
	    driver.close(); 
		
	    	
	    }
	}



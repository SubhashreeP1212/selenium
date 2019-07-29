package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdown {

	public Dynamicdropdown() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		/*driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		
		while(i<4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		
		for(i=0;i<2;i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).click();
		/*Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@value=\"IXB\"]"));
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@value=\"AIP\"]")).click();
		*/
		
		
	}

}

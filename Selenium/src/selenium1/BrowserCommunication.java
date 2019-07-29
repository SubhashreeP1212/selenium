package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommunication {

	public BrowserCommunication() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String args []) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("https://www.google.com/");
		String text = firefoxdriver.findElement(By.linkText("Gmail")).getText();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.xpath("//*[@id=\"uh-search-box\"]")).sendKeys(text);
		
		
		
		
	}

}

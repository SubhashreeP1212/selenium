package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class BuildInMethods {

public static WebDriver driver;

public void LaunchBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
	driver= new FirefoxDriver();
		
}
public void Login() {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("priyadarshinisubhashree231@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("coolpixs3100");
	driver.findElement(By.cssSelector("#u_0_8")).click();
	
	
}
public void login(String username , String password) {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	driver.findElement(By.cssSelector("#u_0_8")).click();
	
	
	
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BuildInMethods obj = new BuildInMethods();
		obj.LaunchBrowser();
	    Thread.sleep(6000);
		obj.Login();
		Thread.sleep(1000);
		driver.close();
		obj.LaunchBrowser();
		obj.login("priyadarshinisubhashree231@gmail.com", "coolpixs3100");
		driver.close();
		

	}

}

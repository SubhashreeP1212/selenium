package selenium1;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyLogin {
	static int i;
	static String username;
	static String password;
	static String iteration;
	
	public verifyLogin() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\DELL\\\\Desktop\\\\Selenium\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		for (i=1;i<=2;i++) {
			
			if (i==1) {
				username="abcd12@gamil.com";
				password="admin@1234";
				iteration= "iteration:1";
			}
			else if (i==2) {
				username="admina";
				password="admin@1232";
				iteration= "iteration:2";
			}
			
		driver.get("http://www.gcrit.com/build3/login.php?osCsid=c1ee8okegcl4hpbl73dtrp6cb5");
		driver.findElement(By.name("email_address")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/p[2]/span/button/span[2]")).click();
		String  url= driver.getCurrentUrl();
		System.out.println(url);
		
	if (url.contains("http://www.gcrit.com/build3/index.php")) {
			System.out.println(iteration + "" + "admin login successful");
					driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/span[4]/a/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/span/span/a/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/a[1]/u")).click();
		Thread.sleep(1000);
		
		
		}
	else if (!url.contains("http://www.gcrit.com/build3/index.php")) {
		
			String errormessage  = driver.findElement(By.xpath("/html/body/div[1]/div[3]/table/tbody/tr/td")).getText();
			if (errormessage.contains("No match for E-Mail")) {
				System.out.println(iteration+ "handling invalid inputs:passed");
			}
			else System.out.println(iteration+"TC : failed");
			
		}
		
		
		
		
	}
		
		driver.close(); //it should be placed outside the for loop ,because if driver is closed then its not started as driver is created outside the loop
}
}
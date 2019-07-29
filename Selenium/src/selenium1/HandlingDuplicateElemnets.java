package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDuplicateElemnets {

	public HandlingDuplicateElemnets() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String args[]) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Program for frame
	/*	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		//driver.switchTo().frame(2);//switching to frame from top window using index
		
		driver.switchTo().frame("classFrame");//switching frame using frame name
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();//switch from frame to top window */
		
	//Program for Mouseover
		/*   driver.get("http://www.carmax.com/");
		//create Action builder instance by passing webdriver instance
		Actions builder = new Actions(driver);
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/nav[2]/div[5]/span"));
		
		Thread.sleep(4000);
		
		builder.moveToElement(menu).build().perform();
		
//moveelement deciedes the target element,build move the focus to the target element and perfom helps to perform the action
		
		driver.findElement(By.linkText("FAQ")).click();
		driver.navigate().back();		**/
		
		// Program to handle multiple windows
		
	/*	driver.get("https://www.google.com/gmail/about/");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[3]/a[1]")).click();
		
		//String currenturl = driver.getCurrentUrl();
		
		//System.out.println(currenturl);
		
		//driver.close(); //closes parent url as focus doesnot move to seconf url
		
		String parent = driver.getWindowHandle(); //handle the parent url only
		//System.out.println(parent);
		
		Set <String> handles = driver.getWindowHandles();
		int count = handles.size();
		System.out.println(count);
		
		
		for (String s1:handles) {
			
			if(! s1.equals(parent)) {
				driver.switchTo().window(s1);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(4000);
				driver.close();
			}
		} */
		// program to handle duplicate elements with condition
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=otmm2dmrkh600ancpj54f8jc00");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	if (url.equals("http://www.gcrit.com/build3/admin/index.php?osCAdminID=otmm2dmrkh600ancpj54f8jc00&osCAdminID=otmm2dmrkh600ancpj54f8jc00")) {
					driver.findElement(By.linkText("Online Catalog")).click();
					System.out.println(driver.getCurrentUrl());
		}
		
		
		
		
		
	}

}

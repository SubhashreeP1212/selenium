package selenium1;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import  org.openqa.selenium.NoSuchElementException;

public class TestCaseWriting {

	public TestCaseWriting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		//validate if link is external or internal in wikipedia page
		/* driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.xpath("//*[@id=\"pt-createaccount\"]/a")).click();
		String url= driver.getCurrentUrl();
		
		if (url.contains("wikipedia.org")) {
			
			System.out.println("Internal link-Tc passed");
		}
		else {
			
			System.out.println("External Link TC passed");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if (!url.contains("wikipedia.org")) {
			
			System.out.println("External link.TC passed");
			
		}
		else {
			System.out.println("internal link .TC failed");
		}
		*/
		//verify if gmail link is available in google home page
		
		/*driver.get("https://www.google.com/");
		
	// when display is declared outside try block the scope is just limited to 
		try {	
		boolean display=driver.findElement(By.linkText("Gmailas")).isDisplayed();
			
		if(display==true) {
			System.out.println("Gmail link dispalyed-TC passed");
		}
		}
		catch(NoSuchElementException e) {
			System.out.println("TC failed");
		}
		driver.close(); */
		
		//IRctc login validation..try giving wait to a page when it takes time to load else will get nosuchelementexception.
		/*
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.id("loginText")).click();
		driver.findElement(By.name("userId")).sendKeys("Gudly12");
		driver.findElement(By.name("pwd")).sendKeys("Gmh474");
		
		Scanner Scan= new Scanner(System.in);
		System.out.println("enter captcha");
		
		String Captcha = Scan.nextLine();
		driver.findElement(By.id("nlpAnswer")).sendKeys(Captcha);
		
		driver.findElement(By.xpath("//*[@id=\"login_header_disable\"]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/form/button"))
	.click();
		//String url =driver.getCurrentUrl();
		Thread.sleep(4000);
   
		 String text=	driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/span[2]")).getText();
			System.out.println(text);
	
			if(text.contains("Welcome")) {
			System.out.println("TC passed");
		}
	
	else{
			System.out.println("TC failed");
		}
	*/
		
	driver.get("http://www.gcrit.com/build3/login.php");	
	driver.findElement(By.linkText("Continue")).click();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
	driver.findElement(By.name("firstname")).sendKeys("Subhashree");
	driver.findElement(By.name("lastname")).sendKeys("pri");
	driver.findElement(By.name("dob")).sendKeys("12/19/1888");//
	driver.findElement(By.name("email_address")).sendKeys("abcd12@gamil.com");//
	driver.findElement(By.name("company")).sendKeys("TCS");
	driver.findElement(By.name("street_address")).sendKeys("huy,78hjhj");
	driver.findElement(By.name("postcode")).sendKeys("1383");
	driver.findElement(By.name("city")).sendKeys("kolkata");
	driver.findElement(By.name("state")).sendKeys("WB");
	
	Select dropdown = new Select(driver.findElement(By.name("country")));
	dropdown.selectByVisibleText("India");
	driver.findElement(By.name("telephone")).sendKeys("8787888");//
	driver.findElement(By.name("password")).sendKeys("admin@1234");
	driver.findElement(By.name("confirmation")).sendKeys("admin@1234");
	driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
	url= driver.getCurrentUrl();
	
	if (url.equals("http://www.gcrit.com/build3/create_account_success.php")) {
		
		System.out.println("TC passed");
	}
	else System.out.println("Tc failed");
	
	
	
	
	}

}

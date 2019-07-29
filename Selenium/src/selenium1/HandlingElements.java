package selenium1;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

 class HandlingElements {

	 
	 public HandlingElements() {
		 
	 }
	public static void main (String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver Driver= new FirefoxDriver();
		
		// program for image
		
		/*Driver.get("https://www.google.com");
		
	System.out.println(Driver.findElement(By.id("hplogo")).isDisplayed());
	System.out.println(Driver.findElement(By.id("hplogo")).getAttribute("id"));
	
	Driver.navigate().to("http://www.newtours.demoaut.com/");
	Driver.findElement(By.name("login")).click();
	
	Driver.navigate().to("https://www.seleniumhq.org");
	Driver.findElement(By.xpath("//*[@id=\"choice\"]/tbody/tr/td[2]/center/a/img")).click(); ***/
		
		// program for link
		/*Driver.get("https://www.google.com");
	WebElement element=	Driver.findElement(By.linkText("Gmail"));
	
	Boolean disable= element.isDisplayed();
	System.out.println(disable);
	
	Boolean enable=element.isEnabled();
	System.out.println(enable); */
		
		//Driver.get("http://gcrit.com/build3/create_account.php");
		
		// program for radio button
		//Driver.get("http://gcrit.com/build3/create_account.php");
			/*WebElement MRadioButton = Driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
			
			MRadioButton.click(); 
			
			Boolean selected = MRadioButton.isSelected(); //if clicked then isSelcted is true or else false
			
			System.out.println(selected);*/
		
	           //Program for dropdown
		/*
		  //Driver.get("http://gcrit.com/build3/create_account.php");
		Select dropdown = new Select ( Driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
		dropdown.selectByIndex(99);;;
		String display = dropdown.getFirstSelectedOption().getText();
		System.out.println(display);
		
		List <WebElement> list = dropdown.getOptions();
		int i =list.size();
		System.out.println(i); */
		
		
		//checkbox program :just find element,check isDisplayed,isEnabled,isselected and click to check
		
		// html table program:find element ,display, for size of row tagname(tr) ,for no of colomn tagname(td) 	
		
		//Program for inline elemets
		
		
		Driver.get("https://www.google.com");
		Driver.findElement(By.cssSelector(".gb_x")).click();
	    Driver.findElement(By.cssSelector(".gb_D")).click();
	    Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[1]/div[2]/ul[2]/li[5]/a/span[1]")).click();//go to hangout
		Thread.sleep(4000);
		Driver.navigate().back();//go to google homepage
		
		
			
		
		
		
	
	
	
		
		
		
		
	}

}

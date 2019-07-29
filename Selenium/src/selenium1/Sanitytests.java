package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
   class Sanitytests {

	public Sanitytests() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
						
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com");
		
		WebElement Email = driver.findElement(By.id("identifierId"));
		Email.sendKeys("Subha");
		String E=Email.getAttribute("value");
		//System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
		System.out.println(E);
		Email.clear();
		
		

	}

}

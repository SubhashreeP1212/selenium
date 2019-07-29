package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowseTesting {

	public CrossBrowseTesting() {
		// TODO Auto-generated constructor stub
	}
public static WebDriver driver;
public static  int browser;
public static String browsername;
	
	public static void main (String args[]) {
	
		
		for(browser=1;browser<=3;browser++) {
			
			if(browser==1) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();	
				browsername="Chrome";
			}
			else if(browser==2) {

				System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					browsername="IE";
				
			}
			else if (browser==3) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\geckodriver.exe");
				driver= new FirefoxDriver();	
				browsername="firefox";
			}
			driver.get("https://www.seleniumhq.org/download/");
			String pagetitle=driver.getTitle();
			System.out.println(pagetitle);
			if (pagetitle.equals("Downloads")){
				System.out.println(browsername +"Selelnium downloads launched and TC passed");
						}
			else {
				System.out.println(browsername +"TC failed");
			}
			driver.close();
			
		}
		
	
	
		
		
		
	
	
	
		
		
		
		
	}
}

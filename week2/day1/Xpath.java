package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException	
	{
		// SETUP BROWSER DRIVER, automatically it will download
		WebDriverManager.chromedriver().setup();
		
		// SETUP BROWSER DRIVER, automatically it will manually
		//System.setProperty("Webdriver.chrome.driver","/loc");
		
		//Launch the browser, create the object
		ChromeDriver driver =new ChromeDriver();
		//FirefoxDriver driver =new FirefoxDriver();
		
		//to open this page on browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username(Ctrl+2,l)
		//WebElement eleUserName =driver.findElement(By.id("username"));
		WebElement eleUserName =driver.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath( "//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(text(),'decorativeSubmit')")).click();
		driver.findElement(By.xpath("//label[text()='CRM/SFA']")).click();	
		driver.findElement(By.xpath("//label[text()='Leads']")).click();
		driver.findElement(By.xpath("//label[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'createLeadForm_companyName')]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sumi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sumi");
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(eleSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.close();	

	}

}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
		WebElement eleUserName =driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumi");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shan");
		//find the select tag element
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//create object from select class
		Select dd = new Select(eleSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.equals("Sumi"))
		{
			System.out.println("First name is correct");
		}
		else
		{
			System.out.println("First name not correct");
		}	
		Thread.sleep(2000);
		driver.close();	

	}

}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setup the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser, create the object
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumi");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("E.C.E");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a super women");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xys19@gmail.com");
		WebElement eleTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleTool);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		//to edit
		driver.findElement(By.linkText("Edit")).click();
		WebElement eleupdate = driver.findElement(By.id("updateLeadForm_description"));	
		eleupdate.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is very important to edit and add information");
		driver.findElement(By.className("smallSubmit")).click();
		//to get the title
		System.out.println("Resulting Page(refer the video): " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}

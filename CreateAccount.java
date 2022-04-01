package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) { 
		Select obj_select;
		//Setup the driver -> we have added required dependencies in pom.xml	 
		WebDriverManager.chromedriver().setup();
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
	
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
	 
		// 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		
		// 6. Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		// 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Debit Limited Account");
		
		// 8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		// 9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id = 'groupNameLocal']")).sendKeys("Test LocalName");
		
		// 10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id= 'officeSiteName']")).sendKeys("Test SiteName");
		
		// 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("//input[@class= 'inputBox' and @id = 'annualRevenue']")).sendKeys("10000");
		
		// 12. Select Industry as ComputerSoftware
		WebElement dd_Industry = driver.findElement(By.name("industryEnumId"));
		obj_select = new Select(dd_Industry);
		obj_select.selectByValue("IND_SOFTWARE");
		
		// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement dd_OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		obj_select = new Select(dd_OwnerShip);
		obj_select.selectByVisibleText("S-Corporation");
		
		// 14. Select Source as Employee using SelectByValue
		WebElement dd_Source = driver.findElement(By.id("dataSourceId"));
		obj_select = new Select(dd_Source);
		obj_select.selectByValue("LEAD_EMPLOYEE");
		
		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement dd_MarketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		obj_select = new Select(dd_MarketingCampaign);
		obj_select.selectByIndex(6);
		
		// 16. Select State/Province as Texas using SelectByValue 
		WebElement dd_StateOrProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		obj_select = new Select(dd_StateOrProvince);
		obj_select.selectByValue("TX");
		
		// 17. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}
}

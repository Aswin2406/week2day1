package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {
	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  String name= driver.getTitle();
		  System.out.println("title"+name);
		  
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("demosalesmanager");
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("crmsfa");
		  
		  WebElement decorative = driver.findElement(By.className("decorativeSubmit"));
		  decorative.click();
		 
		 
		 
		  WebElement liketext = driver.findElement(By.linkText("CRM/SFA"));
		  liketext.click();
		  
		  WebElement leads = driver.findElement(By.linkText("Leads"));
		  leads.click();
		  
		  
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aswin");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aswin");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("AK");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("24/06/1995");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("job");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("450000");
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		  WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		  countrycode.clear();
		  countrycode.sendKeys("91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994071411");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aswinak0007@gmail.com");
		  
		  
		  
		  
		  
		  
		  
		
		
		  
			  
		  
		
	}

}

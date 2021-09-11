package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) 
	{
		//step 1: Manages the driver
				WebDriverManager.chromedriver().setup();
				
				//step 2: Launch the browser
				ChromeDriver driver= new ChromeDriver();
				
				//step 3: Maximize the browser
				driver.manage().window().maximize();
				
				//step 4: launch the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//step 5: get the title of the current browser		
				String title = driver.getTitle();
				System.out.println("Title" +title);
				
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("demosalesmanager");
				
				WebElement passWord = driver.findElement(By.id("password"));
				passWord.sendKeys("crmsfa");	
				
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();
				
				WebElement crmLink=driver.findElement(By.linkText("CRM/SFA"));
				crmLink.click();
				
				String title2 = driver.getTitle();
				System.out.println("Title " + title2);
				
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf pvt");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test leaf");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pvt");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sivaranjani");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("G");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Sigle");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/21/90");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Miss");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("800000");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("22");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("ok added");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("created");
				WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				countryCode.clear();
				countryCode.sendKeys("4");						
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("32");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8765678032");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Harish");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harish@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("BrindhaNair");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Brindha");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.2,East Street");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near park hotel");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600017");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("91");
				
				String fname = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
				System.out.println(fname);
				driver.findElement(By.className("smallSubmit")).click();
				String title3 = driver.getTitle();
				System.out.println(title3);
					

				
	}

}

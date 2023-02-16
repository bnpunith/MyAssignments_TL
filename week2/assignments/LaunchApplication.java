package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Deloitte");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Punith");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gowda");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Puni");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the app");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("punith@gmail.com");
		
		WebElement dd=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sec=new Select(dd);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1500);
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		driver.close();
	}		

}

package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeAppointment {

	public static void main(String[] args) throws Throwable {
		 WebDriver	driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		 Thread.sleep(3000);
		 WebElement makeAppointment= driver.findElement(By.id("btn-make-appointment"));
		 makeAppointment.click();
		 
		 WebElement username= driver.findElement(By.id("txt-username"));
		 username.sendKeys("John Doe");
		 
		 WebElement password= driver.findElement(By.id("txt-password"));
		 password.sendKeys("ThisIsNotAPassword");
		 
		 WebElement login= driver.findElement(By.id("btn-login"));
		 login.click();
		 
		 Thread.sleep(2000);
		 
		 WebElement facility=driver.findElement(By.xpath("//select[@id=\"combo_facility\"]"));
		 Select select=new Select(facility);
		 
		 select.selectByValue("Seoul CURA Healthcare Center");
		 
		 WebElement ApplyForHospitalReadmission=driver.findElement(By.xpath("//input[@id=\"chk_hospotal_readmission\"]"));
		 ApplyForHospitalReadmission.click();
		 
		 Thread.sleep(2000);
		 WebElement radioButton=driver.findElement(By.xpath("//input[@id=\"radio_program_medicaid\"]"));
		 radioButton.click();
		 
		
		 WebElement visitDate=driver.findElement(By.id("txt_visit_date"));
		 visitDate.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']")));
		 
		WebElement month=driver.findElement(By.className("datepicker-switch"));
	    month.click();
	    
	    driver.findElement(By.xpath("//span[text()='Oct']")).click();
	    
	    driver.findElement(By.xpath("//td[text()='6']")).click();
		 
	    WebElement comment=driver.findElement(By.id("txt_comment"));
	    comment.sendKeys("NO Comment");
	    
	    Thread.sleep(2000);
	    
	    WebElement bookAppointment=driver.findElement(By.id("btn-book-appointment"));
	    bookAppointment.click();
	    
	    
	    
		 

	}

}

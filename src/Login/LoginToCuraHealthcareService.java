package Login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginToCuraHealthcareService {

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
	
	 
	

	}

}

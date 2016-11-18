package gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("suvarnakushwaha");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("April@2013");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		
		

	}

}

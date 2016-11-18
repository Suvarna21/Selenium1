package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("skirts");
        driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")).click();
        driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span[1]")).click();
        
        
	}

}

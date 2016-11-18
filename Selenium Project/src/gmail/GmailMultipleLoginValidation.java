package gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import lib.ExcelDataConfig;
public class GmailMultipleLoginValidation {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

//		File src=new File("C:\\Suvarna\\excel data\\GmailLoginTestData.xlsx");
//		
//		FileInputStream fis=new FileInputStream("src");
//		
//		 XSSFWorkbook wb=new XSSFWorkbook("fis");
//		 
//		XSSFSheet sheet1=wb.getSheetAt(0);
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Suvarna\\excel data\\GmailLoginTestData.xlsx");
		System.out.println(excel.getData(0, 1, 0));
		
		String uname=excel.getData(0, 1, 0);
		String pswd=excel.getData(0, 1, 1);
		System.out.println(uname);
		System.out.println(pswd);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(uname);
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(pswd);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
	}
	
	

}

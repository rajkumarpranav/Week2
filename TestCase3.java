package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
// Setup chromebrowser
		WebDriverManager.chromedriver().setup();
// Launch Browser
		ChromeDriver driver = new ChromeDriver();
//Launch URL and maximise
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
//Find User Element
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("rajtest");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rajtest");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rajtest");
		WebElement web = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(web);
		sel.selectByVisibleText("Cold Call");
		driver.findElement(By.name("submitButton")).click();
		WebElement str1 = driver.findElement(By.id("viewLead_dataSources_sp"));
		String str2 = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(str1);
		System.out.println(str2);
	}

}

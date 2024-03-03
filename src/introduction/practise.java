package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practise {

	public static void main(String[] args) throws InterruptedException {
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://rahulshettyacademy.com/locatorspractice/");
//	driver.findElement(By.id("inputUsername")).sendKeys("Sagar");
//	driver.findElement(By.name("inputPassword")).sendKeys("sagar@113");
//	driver.findElement(By.className("signInBtn")).click();
//	Thread.sleep(3000);
//	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//	driver.findElement(By.linkText("Forgot your password?")).click();
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sagar");
//	driver.findElement(By.cssSelector("input[placeholder=Email]")).sendKeys("sagar@gmail.com");
//	driver.findElement(By.xpath("//form/input[3]")).sendKeys("7483933394");
//	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//	Thread.sleep(3000);
//	driver.findElement(By.cssSelector(".go-to-login-btn")).click();
//	driver.findElement(By.id("inputUsername")).sendKeys("sagar yadrami");
//	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//	Thread.sleep(1000);
//	driver.findElement(By.className("signInBtn")).click();
//	Thread.sleep(3000);
//	System.out.println(driver.findElement(By.tagName("p")).getText());
//	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//	driver.findElement(By.className("logout-btn")).click();
//	driver.close();
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = (List<WebElement>) driver.findElement(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		
	
	}

//	public static String getpassword(WebDriver driver) {
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("forgot-pwd-container")).click();
//		driver.findElement(By.className("reset-pwd-btn")).click();
//		String password = driver.findElement(By.cssSelector("form p")).getText();
//		String[] passwordarray = password.split("'");
//		String newpass=passwordarray[1].split("'")[0];
//		return newpass;	
//	}
	
	
}

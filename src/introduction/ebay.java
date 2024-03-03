package introduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ebay {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='_sacat']"));
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		number_of_links(driver);
		
		driver.findElement(By.xpath("//div[contains(text(),'Art Drawings')]")).click();
		String text = driver.findElement(By.xpath("//div[@class='page-notice__main']//p")).getText();
		Assert.assertEquals("0 results found. Try Art Drawings", text);
		
		
		
		
		
		
		
	}
	public static void number_of_links(WebDriver driver) {
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for(int i =0; i < tags.size() ; i++) {
			String text = tags.get(i).getText();
			System.out.println(text);
		}
			
		}

}

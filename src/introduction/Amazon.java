package introduction;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		String myphone = "Apple iPhone 15 Pro Max (256 GB) - Blue Titanium";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(myphone);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")).click();

		 next_window(driver);

		 String title = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		 System.out.println(title);
		 
//		List<WebElement> phones = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
//		for (int i = 0; i < phones.size(); i++) {
//			String text = phones.get(i).getText();
//			if (text.contains(myphone)) {
//				driver.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")).click();
//
//			}

		

	}

	public static void next_window(WebDriver driver) throws InterruptedException {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
	}
}

package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
//		the above line does not work in the different browser so we use below line
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.quit();//quit all the relating tabs
//		 
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://drive.google.com/drive/folders/1nBs25k9jTb06qrV-5fTC75gtPOR6uW4V");
//	    System.out.println(driver.getCurrentUrl());
//	    System.out.println(driver.getTitle());
//	    driver.close();
	    
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/python/python_intro.asp");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
		
		
		

	}

}

package CodingExpert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc11 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		System.out.println(driver.findElement(By.cssSelector("[alt='Selenium Conf Banner']")).isDisplayed());
		
		driver.findElement(By.cssSelector("a[href*='disc']")).click();
		
		List<WebElement> headers=driver.findElements(By.cssSelector("span.link-top-line"));
		
		for(WebElement header:headers) {
			System.out.println(header.getText());
		}
		System.out.println("======================");
		
		List<WebElement> views=driver.findElements(By.cssSelector("td.num.views"));
		
		for(WebElement view:views) {
			System.out.println(view.getText());
		}
		driver.quit();
	}
	
}

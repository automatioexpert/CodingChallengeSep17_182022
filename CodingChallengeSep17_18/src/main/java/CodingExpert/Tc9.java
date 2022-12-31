package CodingExpert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc9 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		System.out.println(driver.findElement(By.cssSelector("[alt='Selenium Conf Banner']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("h1[data-localize='easy-setup']")).getText());

		System.out.println(driver.findElement(By.cssSelector("pre.prettyprint.ninja")).getText());
		
		//Get all footer links
		List<WebElement> footer=driver.findElements(By.cssSelector("ul.footer-links>li"));
		
		for(WebElement foot:footer) {
		System.out.println(foot.getText());
		}
		System.out.println("Total footer are: "+footer.size());
		driver.quit();
	}
	
}

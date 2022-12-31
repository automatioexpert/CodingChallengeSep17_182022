package CodingExpert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		System.out.println(driver.findElement(By.cssSelector("[alt='Selenium Conf Banner']")).isDisplayed());
		driver.findElement(By.cssSelector("[alt='Selenium Conf Banner']")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.main-heading")).getText());

		driver.findElement(By.cssSelector("a.et_pb_promo_button.et_pb_button")).click();
		// Get all the prices and store in a ArrayList

		List<WebElement> salesPrices = driver.findElements(By.cssSelector("span.price"));
		ArrayList<String> prices = new ArrayList<String>();
		for (WebElement sp : salesPrices) {

			prices.add(sp.getText());
		}
		
		System.out.println("Total prices are : "+prices.size());
		System.out.println("Prices recorded are : "+prices);

		System.out.println("Test is Passed");
		driver.quit();

	}
}

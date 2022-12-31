package CodingExpert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		System.out.println(driver.findElement(By.cssSelector("[alt='Selenium Conf Banner']")).isDisplayed());

		String pageSource = driver.getPageSource();

		System.out.println(pageSource);

		System.out.println("Thank God");
		driver.quit();
	}
}

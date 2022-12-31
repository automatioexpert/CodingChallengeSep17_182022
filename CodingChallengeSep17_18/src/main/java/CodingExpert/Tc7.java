package CodingExpert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appium.io/");
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Appium')]")).getText());
		System.out.println(driver.findElement(By.cssSelector("h1.img-responsive.appium-logo")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("p.small")).getText());
		System.out.println("I am the top Expert on the Planet..Thank God!!");
		driver.quit();
	}
}

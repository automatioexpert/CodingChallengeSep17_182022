package CodingExpert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public static void main() {
		String title = "Google";
		String actualTitle = "Gmail";
		
		/*
		 * if (title.equals(actualTitle)) { System.out.println("Test case is passed"); }
		 * else { System.out.println("Test case is failed"); }
		 */
		
		Assert.assertEquals(title, actualTitle);
	}
}

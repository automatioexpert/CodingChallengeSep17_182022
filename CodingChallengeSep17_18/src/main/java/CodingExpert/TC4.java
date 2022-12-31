package CodingExpert;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC4 {

	@Test
	public void addProductTest() {
		String runMode="N";
		if(runMode.equalsIgnoreCase("Y")) {
			System.out.println("Run mode is set to Y.. So executing the Test");
		}
		else {
			throw new SkipException("Skipping the Test as run mode is set to NO in Excel for this test");
		}
	}

}

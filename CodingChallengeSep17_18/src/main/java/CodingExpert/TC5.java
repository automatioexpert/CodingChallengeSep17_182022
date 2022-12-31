package CodingExpert;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC5 {

	@Test
	public void t1() {

		System.out.println("Executing t1 test");
		throw new SkipException("SKIPPED Test");
	}
}

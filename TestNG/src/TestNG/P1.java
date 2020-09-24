package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	
	@Test
	public void apple() {
		System.out.println("from apple()");
	}
	
	@Test
	public void zebra() {
		Reporter.log("from zebra()");
	}
	
	@Test
	public void banana() {
		Reporter.log("from banana()",true);
		
	}

}

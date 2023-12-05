package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executionTest {
@Test
	public void facebookTest() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
@Test(groups="food")
public void zomatoTest() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.zomato.com/");
}
@Test(groups="food")
public void SwiggyTest() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.swiggy.com/");
}
}

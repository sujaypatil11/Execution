package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
@Test
public void facebookTest() {
 WebDriver d=new ChromeDriver();
 d.get("https://www.facebook.com/");
 String actualtitle = d.getTitle();
 System.out.println(actualtitle);
 
}

}

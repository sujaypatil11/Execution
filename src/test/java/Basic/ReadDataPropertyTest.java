package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataPropertyTest {
	public WebDriver d;
@Test
public void vtiger() throws IOException {
	
FileInputStream fis=new FileInputStream("src\\test\\resources\\org.properties");
Properties p=new Properties();
p.load(fis);

String BROWSER=p.getProperty("browser");
String URL=p.getProperty("url");
String USERNAME=p.getProperty("username");
String PASSWORD=p.getProperty("password");

if (BROWSER.equalsIgnoreCase("chrome")) {
	d=new ChromeDriver();
}
else if (BROWSER.equalsIgnoreCase("Edge")) {
	d=new EdgeDriver();
}
else {
	d=new FirefoxDriver();
}
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
d.get(URL);
d.findElement(By.name("user_name")).sendKeys(USERNAME);
d.findElement(By.name("user_password")).sendKeys(PASSWORD);
d.findElement(By.id("submitButton")).click();
System.out.println("Good morning");
}
}

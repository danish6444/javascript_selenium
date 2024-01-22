package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		// setting the chrome browser property  and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		
		//Javascript Executer
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//locate WebElement using javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123abc'");
		
		//scroll down using java script
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, 400)");
		
        //scoll up using java script
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0, -400)");
		
	}

}

package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptp2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Training Materials\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//javascript executer
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//locate webelement using java script
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123abc'");
		
		//scroll down using java script
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 400)");

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, -400)");
					
		
	}

}

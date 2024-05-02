package smoketest;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utils.openChromeBrowser;

public class redbusopen {
	static WebDriver driver;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		
		driver.get("https://redbus.com");
	}
}
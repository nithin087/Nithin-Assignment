
package flash;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class action1{
public static void main(String[] args){


	{
		
		WebDriver driver; // declare webdriver instance
	   
	    driver =new ChromeDriver(); // instantiate new firefox driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.advantageonlineshopping.com");
	    driver.manage().window().maximize();
	    
	    
	    
	    driver.findElement(By.id("menuSearch")).click();
	    
	    driver.findElement(By.id("autoComplete")).sendKeys(Keys.ENTER);
	    
	    try {
	    
	    String Howmany=driver.findElement(By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p")).getText();
	    System.out.println(Howmany);
	    
	    }
	    
	    catch(NoSuchElementException e){
	    	
	    	System.out.println("No results found for");
	    	
	    	
	    }
	    
	    
	    
	    
		
	}
}
}


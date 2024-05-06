package flash;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class pages {
	boolean res;
	String srch="aaduyuyy";
	
	static WebDriver driver;
	//constructor
	 public pages (WebDriver driver) {
		 this.driver=driver;
		 
		 }
	 //Elements
	 By Icon= By.id("menuSearch");
	 By Searchbar= By.id("autoComplete");
	 By Items=By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p");
	 
	 
	//methods
	 public boolean checkboxispresent()
		{
		
		 try {
			    
			    WebElement serachbox=driver.findElement(By.id("autoComplete"));
			    System.out.println(serachbox);
			    res=true;
			    }
			    
			    catch(NoSuchElementException e){
			    	
			    	System.out.println("Serach box not found ");
			    	res=false;
			    	
			    }
			   
				return res;
			
		
		}
	 
	 public void clickLense()
		{
		 driver.findElement(Icon).click();
		
			
		}
	 public void entersearchword()
		{
		 driver.findElement(Searchbar).sendKeys(srch + Keys.ENTER);
			
		}
	 
	 public boolean checkSerachResult() {
	 try {
		    
		    String Howmany=driver.findElement(Items).getText();
		    System.out.println(Howmany);
		    res=true;
		    }
		    
		    catch(NoSuchElementException e){
		    	
		    	System.out.println("No results found for "+ srch);
		    	res=false;
		    	
		    }
	    return res;
	 
	 }
	 
}

package example;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
public class NewTest {		
	    private WebDriver driver;
	    
	   
	    @Before
		public void setUp() throws Exception {
	    	ClassLoader classLoader = getClass().getClassLoader();
	    	File file = new File(classLoader.getResource("chromedriver.exe").getFile());
	    	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    	driver = new ChromeDriver();
		}
	    
	    @Test				
		public void testEasy() {	
			driver.get("https://www.google.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google")); 		
		}	
/*		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}*/	
	    @After
		public void tearDown() throws Exception {
	    	driver.quit();
		}
		
		
}	

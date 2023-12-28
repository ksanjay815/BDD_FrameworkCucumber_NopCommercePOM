package StepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseTest;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends BaseTest{

	public LoginPage lp;
	 public Hooks() throws Throwable {
		super();
		
	}     

		@Before
		public void setup() throws Throwable {
			logger.info("opening browser");
			initialization();
			

		}

		@After
		public void teardown() {
			logger.info("closing browser");
			driver.quit();
		}	
    	    
    
    @After
    public void tearDown(Scenario scenario) {
        		
       driver.quit();
       
    }
    

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        
    	// this is for cucumber junit report
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
      
    }
   
}

package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",   // it will select all feature files 
//		features=".\\Features\\Login.feature",    //it will selec the selected feature file
//		features=".\\Features\\Customer.feature",
		
		
		glue="StepDefinitions",
		plugin= { "pretty","html:reports/myreport.html", 
				  "json:target/cucumber.json",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "rerun:target/rerun.txt",
				},
				
		dryRun=false,    // checks mapping between scenario steps and step definition methods
		monochrome=true,    // to avoid junk characters in output
		publish=true  // to publish report in cucumber server
		//tags="@sanity"  // this will execute scenarios tagged with @sanity
		//tags="@regression"
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
//		tags= "~@end2end"   //this symbol will ignore the end2end testcases
		//"tags",{"@smoke","@sanity"}  // this step will execute the two testcases
		)
public class TestRunner {

}

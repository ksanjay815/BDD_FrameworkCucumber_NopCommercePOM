package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features="Features",   // it will select all feature files 
//		features=".\\Features\\Login.feature",    //it will selec the selected feature file
		features=".\\Features\\Customer.feature",
		glue="StepDefinitions",
		dryRun=false,
		monochrome =true,
		plugin= {"pretty","html:target/HtmlReports","json:target/cucumber.json"}
//		tags= "@regression"
//		tags= "@sanity"
//		tags= "@smoke"
//		tags= "~@end2end"   //this symbol will ignore the end2end testcases
//		"tags",{"@smoke","@sanity"}  // this step will execute the two testcases
		)
public class TestRunner {

}

package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature//cuucmberfeature.feature",
					glue="StepDefinition",
					plugin= {"pretty", "html:target/HtmlReports.html"},
					tags="@getapi or @postapi or @Updateapi or @deleteapi ")
public class Trclass {
	
}

//or @postapi or @Updateapi or @deleteapi
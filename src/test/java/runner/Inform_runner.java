package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"D:\\Spring Tool\\Cucumber_TestNG\\src\\test\\resources\\Form\\Datadriven_form.feature"},
glue = {"step_definition"})
public class Inform_runner extends AbstractTestNGCucumberTests{

}

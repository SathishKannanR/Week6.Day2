package runner;

import io.cucumber.testng.CucumberOptions;
import stepsAss2.BaseClass;

@CucumberOptions(features="src/test/java/feature1/Assignment2.feature",
                 glue="stepsAss2",
                 monochrome= true,
                 publish= true,
                 tags= "@smoke and @sanity")

public class Runner2 extends BaseClass{

}

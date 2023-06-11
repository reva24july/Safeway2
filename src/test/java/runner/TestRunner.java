package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./Features/Login.feature","./Features/Product.feature","./Features/SecondProduct.feature"},glue="/Stepdefenition",
plugin={"pretty","html:reports/myreport.html","json:reports/myreport.json"},
        dryRun=false,monochrome=true,tags="@sanity")

public class TestRunner {

}

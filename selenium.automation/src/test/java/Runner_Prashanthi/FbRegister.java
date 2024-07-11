package Runner_Prashanthi;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue = "stepdefinitions",
tags="@Reg_01,@Reg_02")
public class FbRegister {

	
}

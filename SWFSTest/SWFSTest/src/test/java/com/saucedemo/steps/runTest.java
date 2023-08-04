package com.saucedemo.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"steps"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports/rep"}

		)
public class runTest {


	
	
}

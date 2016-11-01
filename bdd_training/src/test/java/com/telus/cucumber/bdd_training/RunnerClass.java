package com.telus.cucumber.bdd_training;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/cucumber-report.json",
		"html:target/cucumber-htmlreport" }, features = { "src/test/features" })

public class RunnerClass {

}

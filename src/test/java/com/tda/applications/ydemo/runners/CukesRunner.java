package com.tda.applications.ydemo.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/tda/automation/ydemo/features",
		glue="com/tda/applications/ydemo/step_definition",
		dryRun = false

		)
public class CukesRunner {

}

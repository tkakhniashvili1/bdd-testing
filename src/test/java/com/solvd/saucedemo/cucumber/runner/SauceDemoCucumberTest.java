package com.solvd.saucedemo.cucumber.runner;

import com.zebrunner.carina.cucumber.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.solvd.saucedemo.cucumber",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json",
                "junit:target/cucumber-report.xml"
        }
)
public class SauceDemoCucumberTest extends CucumberBaseTest {
}

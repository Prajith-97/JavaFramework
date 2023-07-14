package runner;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import glueCode.test_login;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utility.webDriverManager;

import static utility.webDriverManager.driver;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\JavaIntellij\\Framework\\src\\test\\resources\\features\\login.feature",
        glue = {"stepdefs"},
        plugin = {"html:C:\\JavaIntellij\\Framework\\src\\test\\reports\\cucumberReport.html",
                "json:C:\\JavaIntellij\\Framework\\src\\test\\reports\\cucumberReport.json",
                "junit:C:\\JavaIntellij\\Framework\\src\\test\\reports\\cucumberReport.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:C:\\JavaIntellij\\Framework\\target\\rerun.txt"})


public class testRunner extends AbstractTestNGCucumberTests {

    static test_login login;
    @BeforeTest
    @Parameters({"browser-name"})
    void setUp(String browserName){
        webDriverManager.launchDriver(browserName);
    }

    @BeforeClass
    public void beforeClass(){
        login = new test_login(driver);
    }

}

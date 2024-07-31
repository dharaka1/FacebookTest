package RunnerPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\FeaturePack\\FaceBook.feature", glue = "StepPack",dryRun = false, publish = true, monochrome = true, plugin = {
		"html:target\\FB.report\\124.html", "json:target\\FB.report\\repart2.json" })

public class RunnerClass extends BaseClass {
	@BeforeClass
	public static void start() {
		BrowserLaunch();

		maximize();
	}

	@AfterClass
	public static void end() {
		quit();
	}
}


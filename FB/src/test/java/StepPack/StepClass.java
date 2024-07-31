package StepPack;

import BasePack.BaseClass;
import PomPack.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass  extends BaseClass{
PomClass ps=new PomClass();
	@Given("User Enters url")
	public void user_enters_url() {
		driver.get("https://www.facebook.com/");
	}
	@When("Enter User name")
	public void enter_user_name() {
		driver.findElement(ps.UserName).sendKeys("Dharakasun89@gmail.com");
	}
	@When("Enter User Password")
	public void enter_user_password() {
		driver.findElement(ps.password).sendKeys("7543543892729");
	}
	@Then("click Login")
	public void click_login() {
		   driver.findElement(ps.Login).click();

	}



}

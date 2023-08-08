package StepDefinition;

import org.testng.annotations.Test;

import Pageobjectpost.Caliingpojo;

import io.cucumber.java.en.*;

public class sdpostclass {
	
	Caliingpojo co;
	
	@Test(priority=1)
	
	@Given("User open the dummy rest post api website")
	public void user_open_the_dummy_rest_post_api_website() {
		System.out.println("User sucessfully opens the dummy rest post api website");  
	}
	
	
	
	@Test(priority=2)
	
	@When("user creates the record")
	public void user_creates_the_record() {
		co= new Caliingpojo();
		co.responsemethod();
		co.createuserbypojo();
	}
	
	
	@Test(priority=3)
	
	@Then("User sucessfully view the record in databse")
	public void user_sucessfully_view_the_record_in_databse() {
	  	 System.out.println("User sucessfully view the record in databse");
		
	}
}

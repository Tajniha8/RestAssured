package StepDefinition;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;

import Pageobject.Poanget;

import io.cucumber.java.en.*;

public class sdclass {


	Poanget poc;
	@Test(priority=1)
	
	@Given("User open the dummy rest api website")
	public void user_open_the_dummy_rest_api_website() {

	
		System.out.println("user_open_the_dummy_rest_api_website");
		
	}
	
	@Test(priority=2)
	@When("user sends the request to the server")
	public void user_sends_the_request_to_the_server() {
	
		poc =new Poanget();
		poc.responsemethod();
		poc.getheresponse();
	}

	@Test(priority=3)
	@Then("User get the response from the server")
	public void user_get_the_response_from_the_server() {
	    
		System.out.println("User sucessfully get the response from the server");
		
	}

}

package StepDefinition;

import org.testng.annotations.Test;


import Poput.Poput;
import io.cucumber.java.en.*;

public class Sdputclass {

	
	
	Poput po;
	@Test(priority=1)
	@Given("User open the dummy rest put api website")
	public void user_open_the_dummy_rest_put_api_website() {
	    
		System.out.println("User sucessfully open the dummy rest put api website");	
	}

	
	@Test(priority=2)
	@When("user updates the record")
	public void user_updates_the_record() {
	   
		po = new Poput();
		po.responsemethod();
		po.updateuser();
	}

	@Test(priority=3)
	@Then("User sucessfully view the updated record in databse")
	public void user_sucessfully_view_the_updated_record_in_databse() {
	  
		System.out.println("User sucessfully view the updated record in databse");	
		
	}


}

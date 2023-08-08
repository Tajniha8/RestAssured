package StepDefinition;

import org.testng.annotations.Test;

import Pageobjectdelete.Podelclass;
import io.cucumber.java.en.*;

public class Sddeleteclass {

	Podelclass po;
	@Test(priority=1)
	@Given("User open the dummy rest delete api website")
	public void user_open_the_dummy_rest_delete_api_website() {
	    System.out.println("User open the dummy rest delete api website");
	}

	
	@Test(priority=2)
	@When("user delete the record")
	public void user_delete_the_record() {
	   po =new Podelclass();
	   po.responsemethod();
	   po.deleteuser();
		
	}

	@Test(priority=3)
	@Then("User sucessfully view the delete record in databse")
	public void user_sucessfully_view_the_delete_record_in_databse() {
	  	System.out.println("User sucessfully view the delete record in databse");
		
	}

}

package Pageobjectdelete;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aprop.Propertiesfile;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class Podelclass extends Propertiesfile {
	String server= LoadProperties().getProperty("url");
	ResponseSpecification httpresponse;
	@BeforeClass
	public void responsemethod()
	{
		ResponseSpecBuilder resBuilder =new ResponseSpecBuilder();
		httpresponse =resBuilder
				.expectStatusCode(204)
				.expectHeader("Etag",equalTo("W/\"2-vyGp6PvFo4RvsFtPoIWeCReyIC8\""))
				.expectHeader("NEL",equalTo("{\"success_fraction\":0,\"report_to\":\"cf-nel\",\"max_age\":604800}"))
				.build();
	}
	@Test
	public void deleteuser()
	{
		given()
			.baseUri(server)
		.when()
			.delete("/users/6")
		
		.then()
			.spec(httpresponse)
			.log().all();
		
	}

}

package Pageobjectpost;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aprop.Propertiesfile;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class Caliingpojo extends Propertiesfile{

	String server= LoadProperties().getProperty("url");
	ResponseSpecification httpresponse;
	@BeforeClass
	public void responsemethod()
	{
		ResponseSpecBuilder resBuilder =new ResponseSpecBuilder();
		httpresponse =resBuilder
				.expectStatusCode(201)
				.expectHeader("Content-Type",equalTo("application/json; charset=utf-8"))
				.expectHeader("Server",equalTo("cloudflare"))
				.expectHeader("Via",equalTo("1.1 vegur"))
				.expectHeader("X-Powered-By",equalTo("Express"))
				.build();
	}
	@Test
	public void createuserbypojo()
	{
		Pojoclass data =new Pojoclass();
		data.setName("Shamshad");
		data.setJob("student");
		 given()
		 	.baseUri(server)
			.contentType("application/json")
			.body(data)
		.when()
			.post("/users")
			
		.then()
			.assertThat().body("name",equalTo("Shamshad"))
			.assertThat().body("job",equalTo("student"))
			.spec(httpresponse)
			.assertThat().log().all();
}
}
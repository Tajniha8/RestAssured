package Poput;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Aprop.Propertiesfile;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class Poput extends Propertiesfile {
	String server= LoadProperties().getProperty("url");
	ResponseSpecification httpresponse;
	@BeforeClass
	public void responsemethod()
	{
		ResponseSpecBuilder resBuilder =new ResponseSpecBuilder();
		httpresponse =resBuilder
				.expectStatusCode(200)
				.expectHeader("Content-Type",equalTo("application/json; charset=utf-8"))
				.expectHeader("Access-Control-Allow-Origin",equalTo("*"))
				.expectHeader("Connection",equalTo("keep-alive"))
				.expectHeader("Content-Encoding",equalTo("gzip"))
				.build();
	}
	@Test
	public void updateuser()
	{
		HashMap data =new HashMap();
		data.put("name", "Shaik");
		data.put("job", "Engineer");
		
		given()
		.baseUri(server)
			.contentType("application/json")
			.body(data)
		.when()
			.put("/users/2")
			
		.then()

			.assertThat().body("name",equalTo("Shaik"))
			.assertThat().body("job",equalTo("Engineer"))
			.spec(httpresponse)
			.assertThat().log().all();
		
	}

}

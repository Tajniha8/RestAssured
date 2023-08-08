package Pageobject;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;
import Aprop.Propertiesfile;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Poanget extends Propertiesfile {
	
	String server= LoadProperties().getProperty("url");
	ResponseSpecification httpresponse;
	@BeforeClass
	public void responsemethod()
	{
		ResponseSpecBuilder resBuilder =new ResponseSpecBuilder();
		httpresponse =resBuilder
				.expectStatusCode(200)
				.expectHeader("Content-Type",equalTo("application/json; charset=utf-8"))
				.expectHeader("Server",equalTo("cloudflare"))
				.expectHeader("Cache-Control",equalTo("max-age=14400"))
				.expectHeader("Content-Encoding",equalTo("gzip"))
				.build();
	}
	@Test
	public void getheresponse() {
		given()

			.baseUri(server)
		.when()
			.get("/users/3")
		.then()		
			.spec(httpresponse)
			.log().all();
	}
	
	
	
}
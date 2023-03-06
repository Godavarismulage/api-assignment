package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import files.payload;
public class loginuser {
 @Test
	public void login() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().header("content-type", "application/json")
		.body(payload.registerlogin())
		.when().post("/login")
		.then().log().all().assertThat().statusCode(400).extract().response().asString();
	}
@Test
 public void login1() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().header("content-type", "application/json")
		.body(payload.registerlogin())
		.when().post("/logins")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
	}
@Test
	public void login2() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().header("content-type", "application/json")
//		.body(payload.registerlogin())
		.when().post("/login")
		.then().log().all().assertThat().statusCode(400).extract().response().asString();
	}
}

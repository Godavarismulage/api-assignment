package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class putuser {
  @Test
	public void update() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().pathParam("id","1")
		.when().put("/users/{id}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}

  @Test
 	public void update1() {
 		// TODO Auto-generated method stub

 		RestAssured.baseURI = "https://reqres.in/api/";
 		given().log().all().pathParam("id","4")
 		.when().put("/user/{id}")
 		.then().log().all().assertThat().statusCode(200).extract().response().asString();
 	}
}

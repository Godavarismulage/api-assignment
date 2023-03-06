package api.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class deleteuser {
    @Test
	public void delete(){
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().pathParam("id","1")
		.when().delete("/user/{id}")
		.then().log().all().assertThat().statusCode(204).extract().response().asString();
		
	}

    @Test
	public void delete1(){
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().pathParam("id","6")
		.when().delete("/users/{id}")
		.then().log().all().assertThat().statusCode(204).extract().response().asString();
		
	}
   

}

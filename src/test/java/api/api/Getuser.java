 package api.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Getuser {
@Test
	public void fetch1() {
		// TODO Auto-generated method stub
  
		RestAssured.baseURI = "https://reqres.in/api/";
		given().log().all().pathParam("id","2")
		.when().get("users/{id}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
	}
 
 @Test
     public void fetch2() {
	// TODO Auto-generated method stub

	     RestAssured.baseURI = "https://reqres.in/api/";
	     RequestSpecification api = given().log().all().pathParam("id","3");
	   
	      Response resp = api.when().get("user/{id}");
	      String server = resp.header("server");
	      Assert.assertEquals(server, "cloudflare");
	      String ser= resp.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
}
 
}

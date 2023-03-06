package api.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import files.payload;

public class Registeruser {
  @Test(priority = 1)
	public void register() {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI = "https://reqres.in/api/";
		String response = given().log().all().header("content-type", "application/json")
		.body(payload.register())
		.when().post("/register")
		.then().log().all().assertThat().statusCode(400)
		.body("error", equalTo("Note: Only defined users succeed registration")).extract().response().asString();
		
		System.out.println(response);
		
  
  }
@Test(priority = 2)
	public void register1() {
	
	RestAssured.baseURI = "https://reqres.in/api/";
	given().log().all().header("content-type", "application/json").body(payload.register())
	.when().post("/register")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
      
  
  
}
  @Test(priority = 3)
    public void register2() {

      RestAssured.baseURI = "https://reqres.in/api/";
      given().log().all().header("content-type", "application/json").body(payload.register())
        .when().post("/registers")
        .then().log().all().assertThat().statusCode(201).extract().response().asString();

}
  @Test(priority = 4)
  public void register3() {

    RestAssured.baseURI = "https://reqres.in/api/";
   String response = given().log().all().header("content-type", "application/json").body(payload.registerlogin())
      .when().post("/registers")
      .then().log().all().assertThat().statusCode(201).extract().response().asString();
   
   System.out.println(response);
   JsonPath js = new JsonPath(response);
   String Username=js.getString("username");
   System.out.println(Username);
}
//  @Test
// 	public void regi2(){
//  String response = given().log().all().header("Content-Type","application/json")
//  		.body(payload.registerlogin())
//  		.when().post("/registers}")
//  		.then().assertThat().statusCode(201)
//  		.body("error", equalTo("Note: Only defined users succeed registration"))
//  		.header("server", "cloudflare").extract().response().asString();
}



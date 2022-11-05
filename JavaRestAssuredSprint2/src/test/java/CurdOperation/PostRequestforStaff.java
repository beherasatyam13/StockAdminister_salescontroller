package CurdOperation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class PostRequestforStaff {
	
	@Test
	public void PostRequestforStaff() {
		
		JSONObject obj=new JSONObject();
		
		obj.put("email", "beherasatyam13@gmail.com");
		obj.put("id", "7");
		obj.put("password" , "Satyam@123");
		obj.put("phone", "6370809056");
		obj.put("name", "Satyam");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("/staff").then()
		.assertThat().statusCode(200)
		.log().all();
		
	}

}

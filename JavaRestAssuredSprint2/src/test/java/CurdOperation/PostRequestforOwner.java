package CurdOperation;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

 class PostRequestforOwner {

	
	private static final String Orders[] = null;

	@Test
public void PostRequestforOwner() {
		
		JSONObject obj=new JSONObject();
		 
		  
		  obj.put("address", "Banglore");
		  obj.put("comapnyName", "Capgemini");
		 obj.put("department", "IT");
		 obj.put("email", "beherasatyam13@gmail.com");
		  obj.put("name", "Satyam");
		  obj.put("password", "Satyam@123");
		  obj.put("phone", "6370809056");
		  
		
		  given()
			.contentType(ContentType.JSON)
			.body(obj)
			.when()
			.post("/owner").then()
			.assertThat().statusCode(200)
			.log().all();
				}

}


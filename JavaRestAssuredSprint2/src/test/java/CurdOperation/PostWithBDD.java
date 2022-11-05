package CurdOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class PostWithBDD {

	
	@Test
	public void postWithBDD() {
		JSONObject obj=new JSONObject();

		obj.put("date_and_time", "2022-10-31T05:04:30.066Z");
		obj.put("email", "beherasatyam13@gmail.com");
		obj.put("id", 2);
		obj.put("name", "Satyam");
		obj.put("phone","6370809056");
		obj.put("price", 2000);
		obj.put("qty", 1);

		 given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("/sales").then()
		.assertThat().statusCode(200)
		.log().all();
			}
			
}

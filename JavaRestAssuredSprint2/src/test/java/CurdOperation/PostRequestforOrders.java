package CurdOperation;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestforOrders {
	@Test
	public void PostRequestforOrders() {
		
		JSONObject obj=new JSONObject();
		
		obj.put("orderId", "2");
		obj.put("productName", "MacBook");
		obj.put("qtyOrder", "2");
		obj.put("qtyRecived", "2");
		obj.put("totalOrderCost", "15000");
		obj.put("totalOrderRecived", "2");
		
		 given()
			.contentType(ContentType.JSON)
			.body(obj)
			.when()
			.post("/orders").then()
			.assertThat().statusCode(200)
			.log().all();
	}

}

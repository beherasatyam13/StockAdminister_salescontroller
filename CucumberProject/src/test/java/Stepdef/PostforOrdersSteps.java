package Stepdef;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostforOrdersSteps {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want to pass data into database")
	public void user_want_to_pass_data_into_database() {
JSONObject obj=new JSONObject();
		
		obj.put("orderId", "2");
		obj.put("productName", "MacBook");
		obj.put("qtyOrder", "2");
		obj.put("qtyRecived", "2");
		obj.put("totalOrderCost", "15000");
		obj.put("totalOrderRecived", "2");
		
		
		req = RestAssured.given()
				.body(obj)
				.contentType(ContentType.JSON);
	}

	@When("User want to pass data by using URI {string}")
	public void user_want_to_pass_data_by_using_uri(String url) {
		res = req.post(url);	}

	@Then("User want to validate Statusline {string}")
	public void user_want_to_validate_statusline(String string) {
		validate = res.then();
	}

	@Then("User want to validate StatusCode {int}")
	public void user_want_to_validate_status_code(Integer code) {
		validate.assertThat().statusCode(code)
		.log().all();
	}

}

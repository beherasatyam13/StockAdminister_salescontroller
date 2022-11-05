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

public class PostSteps {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("User want to pass the data into database")
	public void user_want_to_pass_the_data_into_database() {
	  JSONObject obj = new JSONObject();
	  obj.put("date_and_time", "2022-10-31T05:04:30.066Z");
		obj.put("email", "beherasatyam13@gmail.com");
		obj.put("id", 2);
		obj.put("name", "Satyam");
		obj.put("phone","6370809056");
		obj.put("price", 2000);
		obj.put("qty", 1);
		
		req = RestAssured.given()
				.body(obj)
				.contentType(ContentType.JSON);
	  
	}

	@When("User want to pass the data by using URI {string}")
	public void user_want_to_pass_the_data_by_using_uri(String url) {
	 res = req.post(url);
	}

	@Then("User want to validate status line {string}")
	public void user_want_to_validate_status_line(String string) {
	 validate = res.then();
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer code) {
		validate.assertThat().statusCode(code)
		.log().all();
	}

}

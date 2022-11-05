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

public class PostforStaffSteps {
	
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	
	@Given("User want to Pass data into Database")
	public void user_want_to_pass_data_into_database() {

		JSONObject obj=new JSONObject();
		
		obj.put("email", "beherasatyam13@gmail.com");
		obj.put("id", "7");
		obj.put("password" , "Satyam@123");
		obj.put("phone", "6370809056");
		obj.put("name", "Satyam");
		
		
		
		
		req = RestAssured.given()
				.body(obj)
				.contentType(ContentType.JSON);
	}

	@When("User want to Pass Data by using URI {string}")
	public void user_want_to_pass_data_by_using_uri(String url) {
		res = req.post(url);
	}

	@Then("User want to Validate statusline {string}")
	public void user_want_to_validate_statusline(String string) {
		validate = res.then();
	}

	@Then("User want to validate Status Code {int}")
	public void user_want_to_validate_status_code(Integer code) {
		validate.assertThat().statusCode(code)
		.log().all();
	}

}

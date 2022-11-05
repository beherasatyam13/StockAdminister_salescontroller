package Stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSteps {

	Response res;
	ValidatableResponse validate;
	
	@When("User want to read the data by using URI {string}")
	public void user_want_to_read_the_data_by_using_uri(String url) {
	    res = RestAssured.get(url); 
	}

	@Then("User want to verify status line {string}")
	public void user_want_to_verify_status_line(String statusLine) {
	     validate = res.then();
	}

	@Then("User want to verify status code {int}")
	public void user_want_to_verify_status_code(Integer code) {
	    validate.assertThat().statusCode(code)
	    .log().all();
	}

	
}

package Stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetBynameSteps {
	Response res;
	ValidatableResponse validate;
	@When("User want to read name by using name URI {string}")
	public void user_want_to_read_name_by_using_name_uri(String url) {
	    res = RestAssured.get(url);

	}

	@Then("User want to verify name Statusline {string}")
	public void user_want_to_verify_name_statusline(String statusline) {
		validate = res.then();
	}

	@Then("User want to verify StatusCode is {int}")
	public void user_want_to_verify_status_code_is(Integer int1) {
		validate.assertThat().statusCode(int1)
	    .log().all();
	}
}

	
	    
	
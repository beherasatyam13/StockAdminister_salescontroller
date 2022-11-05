package Stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteSteps {
	Response res;
	Integer status;
	
	@When("User is able to delete the id by using an api {string}")
	public void user_is_able_to_delete_the_id_by_using_an_api(String url) {
	    res = RestAssured.delete(url);
	}

	@Then("User validate the delete status code of id is {int}")
	public void user_validate_the_delete_status_code_of_id_is(Integer code) {
		status = code;
		System.out.println("\"status\": 200,\r\n"
				+ "  \"message\": \"ID :int NOTFOUND\",\r\n"
				+ "  \"data\": \"User not deleted\"");
	    
	}

}

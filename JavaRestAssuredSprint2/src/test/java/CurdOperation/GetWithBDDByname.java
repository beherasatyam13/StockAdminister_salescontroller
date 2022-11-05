package CurdOperation;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWithBDDByname {
	
	
	@Test
	public void GetWithBDDByname()
	{
		
		baseURI ="http://localhost:8080";
		when()
		.get("/sales?name=satyam")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}}

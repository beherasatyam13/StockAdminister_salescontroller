package CurdOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class DeleteWithBDD 

{
	
	@Test
	public void DeleteWithBDD()
	{
		baseURI ="http://localhost:8080";
		 
		when()
		.delete("/sales?id=2")
		
		.then()
		.assertThat().statusCode(404)
		.log().all();
		
	}

}

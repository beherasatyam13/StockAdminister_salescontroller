package CurdOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetWithBDD {

@Test	
	public void getWithBDD()
{
		
	baseURI ="http://localhost:8080";
	when()
	.get("/sales")
	.then()
	.assertThat().statusCode(200)
	.log().all();
	
	
	}
	
}

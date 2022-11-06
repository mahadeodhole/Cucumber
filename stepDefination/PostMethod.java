package stepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PostMethod {
	  RequestSpecification req;
	  Response res;
	  ValidatableResponse validate;
	
	
	@Given("User want to pass the data into the database")
	public void user_want_to_pass_the_data_into_the_database() {
	   JSONObject obj=new JSONObject();
	   
	   obj.put("email", "xdozyijhvgjgv65673578@gmail.com");
	   obj.put( "name", "mahadedfsybcfiop");
	   obj.put("phone","8986787869");
	   obj.put("dob", 1999-07-06);
	   obj.put("id",66);
	   
	    req = RestAssured.given();
	    req.body(obj);
	    req.contentType(ContentType.JSON);
	}

	@When("User want to pass the data by using URI {string}")
	public void user_want_to_pass_the_data_by_using_uri(String URI) {
		res = req.post(URI);
		
	   
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer int1) {
		 
	   validate = res.then();
	   validate.assertThat().statusCode(int1).log().all();
	}


	
}

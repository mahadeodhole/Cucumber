package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetWithEmail {
	Response res;
	  ValidatableResponse validate;
	
	@When("User want to get the data by using URI {string}")
	public void user_want_to_get_the_data_by_using_uri(String URI1) {
		 RequestSpecification req = RestAssured.given().contentType("application/json");
		 
		 res=req.delete(URI1);
	   
	}

	@Then("User want to get  status code {int}")
	public void user_want_to_get_status_code(Integer int1) {
		 validate = res.then()
		   .log().all();
	   
	}

}

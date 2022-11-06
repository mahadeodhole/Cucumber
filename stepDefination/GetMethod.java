package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	 Response res;
	  ValidatableResponse validate;
	
	@When("User able to pass the data by using URI {string}")
	public void user_able_to_pass_the_data_by_using_uri(String URI1) {
		 RequestSpecification req = RestAssured.given().contentType("application/json");
		 
		 res=req.delete(URI1);
	    
	}

	@Then("User able to validate status code {int}")
	public void user_able_to_validate_status_code(Integer code) {
		 
		   validate = res.then()
		   
		  . log().all();
	   
	}

}

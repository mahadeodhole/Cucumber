package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteMethod {
	 Response res;
	  ValidatableResponse validate;
	@When("User able to delete the data by using URI {string}")
	public void user_able_to_delete_the_data_by_using_uri(String URI2) {
		 RequestSpecification req = RestAssured.given().contentType("application/json");
				 
				 res=req.delete(URI2);
	    
	}

	@Then("User is able to validate status code {int}")
	public void user_is_able_to_validate_status_code(Integer int1) {
		   validate = res.then();
		   validate.assertThat().statusCode(int1).log().all();
	    
	}



}

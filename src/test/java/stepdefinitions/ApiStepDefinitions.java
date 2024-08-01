package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class ApiStepDefinitions {

	private Response response;

	@Given("I set up the API request")
	public void i_set_up_the_api_request() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

	@When("I send the request to the API")
	public void i_send_the_request_to_the_api() {
		response = RestAssured.get("/posts/1");
	}

	@Then("I should receive a 200 status code")
	public void i_should_receive_a_200_status_code() {
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}

package steps;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APISteps {
    
    @When("Realizo um GET para o endpoint de usuarios status 200 error")
    public void realizarGet200error() {
        RestAssured.baseURI = "https://reqres.in";
        given().when().get("/api/users/2").then().statusCode(401); 
    }
    
    @When("Realizo um GET para o endpoint de usuarios status 401 right")
    public void realizarGet401right() {
        RestAssured.baseURI = "https://reqres.in";
        given().when().get("/api/users/2").then().statusCode(401);
    }
}
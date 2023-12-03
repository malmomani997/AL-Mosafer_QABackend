package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.searchChalet.GetCityResponse;
import resources.Utils;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllCitiesDataSteps extends Utils {

    RequestSpecification request;

    Response response;

    ObjectMapper objectMapper = new ObjectMapper();


    @Given("the user clicks on the list cities option")
    public void the_user_clicks_on_the_list_cities_option() throws IOException {

      request = given().spec(requestSpecificationWithQueryParam("locale" , "en"));

    }
    @When("the list gets opened")
    public void the_list_gets_opened() {

    response = request.when().get("/api/accommodation/lookup/city");
    response.then().spec(responseSpecification()).extract().response();

    }
    @Then("verify the cities data with {int} and {string} also with the following {int}")
    public void verify_the_cities_data_with_and_also_with_the_following(int cityId, String cityName, int cityRank) throws JsonProcessingException {
        List<GetCityResponse> cities = objectMapper.readValue(response.body().asString(), new TypeReference<>() {});

        for (GetCityResponse city : cities){
            int id = city.getId();
            String value = city.getValue();
            int rank = city.getRank();

            if (id == cityId){
                Assert.assertEquals(value,cityName);
                Assert.assertEquals(rank , cityRank);
            }
        }

    }

}

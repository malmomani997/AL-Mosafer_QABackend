package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import resources.TestDataBuild;
import resources.Utils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class SearchApiSteps extends Utils {

    RequestSpecification request ;

    Response response ;

    TestDataBuild data = new TestDataBuild();

    int searchId;

    int totalCount;

    @Given("when the user select city for chalet with {int} with {string} and {string} dates")
    public void when_the_user_select_city_for_chalet_with_with_and_dates(Integer searchedCityId, String checkIn, String checkOut) throws IOException {

        searchId = searchedCityId;
        request = given().spec(requestSpecification()).body(data.searchChaletRequest(searchedCityId , checkIn , checkOut));
    }

    @When("The user search for the wanted chalet")
    public void the_user_search_for_the_wanted_chalet() {

        response = request.when().post("/api/accommodation/property/search");
        response.then().spec(responseSpecification()).extract().response();
    }

    @Then("verify all the available chalets are being returned")
    public void verify_all_the_available_chalets_are_being_returned() {

        totalCount = getJsonPathInt(response, "totalCount");
        int returnedProperties = getJsonPathInt(response, "properties.size()");

        if (totalCount > 10) {
            Assert.assertTrue(returnedProperties == 10);
        } else if (totalCount < 10) {
            Assert.assertEquals(totalCount, returnedProperties);
        }

    }

    @Then("verify the data for correct city is being returned")
    public void verify_the_data_for_correct_city_is_being_returned() {

        int cityId = getJsonPathInt(response, "properties[0].location.cityId");
        Assert.assertEquals(cityId, searchId);
    }

}

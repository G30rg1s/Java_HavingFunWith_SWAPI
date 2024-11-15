import Entities_Factory.PeopleFactory;
import Entities_Utility_Classes.Expected_Entities.PaginatedResponse;
import Entities_Utility_Classes.Expected_Entities.People;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class PeopleTests {

    private static People expectedPeople;

    @BeforeAll
    public static void setup() throws IOException {

        expectedPeople = PeopleFactory.createPeopleFromFile("People_LukeSkywalker.txt");
        RestAssured.baseURI = "https://swapi.dev/api";
    }

    @Test
    @DisplayName("Testing the first people, Luke Skywalker, by using pathParam id=1")
    public void testGetFirstPeopleById() {
        int id = 1;
        Response response = given()
                .pathParam("id", id)
                .when()
                .get("/people/{id}")
                .then()
                .statusCode(200)
                .extract().response();

        People actualPeople = response.as(People.class);
        assertEquals(expectedPeople, actualPeople, "The actual and expected People objects do not match!");
    }

    @Test
    @DisplayName("Testing a complete response for many people")
    void testPeoplePaginationFromApi() {

        // Step 1: Set the base URI for the Star Wars API
        System.out.println("Step 1: Setting up the base URI for the Star Wars API.");
        RestAssured.baseURI = "https://swapi.dev/api";

        // Step 2: Make a GET request to the /people endpoint and extract the response
        System.out.println("Step 2: Sending a GET request to the /people endpoint and extracting the response.");
        Response response = RestAssured
                .given()
                .when()
                .get("/people")
                .then()
                .statusCode(200)
                .extract()
                .response();

        // Step 3: Extract pagination details and results
        System.out.println("Step 3: Extracting pagination details and results from the response.");
        int count = response.jsonPath().getInt("count");
        String next = response.jsonPath().getString("next");
        String previous = response.jsonPath().getString("previous");
        List<People> results = response.jsonPath().getList("results", People.class);

        // Step 4: Create the PaginatedResponse object
        System.out.println("Step 4: Creating the PaginatedResponse object.");
        PaginatedResponse<People> actualPeoplePagination = new PaginatedResponse<>(count, next, previous, results);

        // Step 5: Validate the pagination details
        System.out.println("Step 5: Validating the pagination details.");
        assertEquals(82, actualPeoplePagination.getCount(), "Expected total count of people");
        assertNotNull(actualPeoplePagination.getNext(), "Next page URL should not be null");
        assertNull(actualPeoplePagination.getPrevious(), "Previous page should be null for the first page");
        assertNotNull(actualPeoplePagination.getResults(), "Results should not be null");
        assertEquals(10, actualPeoplePagination.getResults().size(), "Expected 10 people per page");

        // Step 6: Get expected keys dynamically using reflection
        System.out.println("Step 6: Getting expected keys dynamically using reflection.");
        List<String> expectedKeys = Arrays.stream(People.class.getDeclaredFields())
                .map(field -> {
                    JsonProperty annotation = field.getAnnotation(JsonProperty.class);
                    return annotation != null ? annotation.value() : field.getName();
                })
                .toList();


        // Step 7: Validate that all objects in the results conform to the expected schema
        System.out.println("Step 7: Validating that all objects in the results conform to the expected schema.");
        for (People person : actualPeoplePagination.getResults()) {
            Map<String, Object> personMap = response.jsonPath().getMap("results[" + actualPeoplePagination.getResults().indexOf(person) + "]");
            for (String key : expectedKeys){
                assertTrue(personMap.containsKey(key), "Expected key '" + key + "' is missing");
            }
        }
    }

}

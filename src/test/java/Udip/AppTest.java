package Udip;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;

import io.restassured.specification.Argument;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void BDD_restApi()
    {
                given()
                .when()
                .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")

                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("City", equalTo("Hyderabad"))
                .header("Content-Type", "application/json");
    }
}

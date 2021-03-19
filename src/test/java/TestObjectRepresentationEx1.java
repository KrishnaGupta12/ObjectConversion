import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestObjectRepresentationEx1 {

    @Test
    public void test_Post() {
        JSONObject requuest = new JSONObject();
        requuest.put("name", "Dhoni");
        requuest.put("job", "Criketor");
        System.out.println(requuest);
        System.out.println(requuest.toJSONString());
        Response response =
        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .body(requuest.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .log().all()
                .extract().response();



    }
}

package restApiTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class RestApiTest extends EmailValidator {

	public static Response response;
	public static String jsonAsString;

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}

	@Test
	public void gettingAUserId() {
		response = RestAssured.get("/users/1").then().extract().response();

		jsonAsString = response.asString();
		JsonPath jsonPath = JsonPath.from(jsonAsString);
		String email = jsonPath.get("email");
		System.out.println(email);
		validate((String) jsonPath.get("email"));
	}

	@Test
	public void verifyingValidContent() {
		response = RestAssured.get("/posts/1").then().extract().response();
		
		jsonAsString = response.asString();
		JsonPath jsonPath = JsonPath.from(jsonAsString);
		
		Assert.assertEquals(1, jsonPath.getInt("userId"));
		Assert.assertEquals(1, jsonPath.getInt("id"));
		Assert.assertEquals("sunt aut facere repellat provident occaecati excepturi optio reprehenderit", jsonPath.get("title"));
		Assert.assertEquals("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto", jsonPath.get("body"));
		
		

	}

	@Test
	public void postingWithAValidUser() {

		response = RestAssured.given().body(body(1, 1, "Here goes the title", "Seems like the test works")).when()
				.post("/posts");

		Assert.assertEquals(201, response.getStatusCode());

	}

	private String body(int userId, int id, String title, String body) {
		String myJson = "{\"" + "userId" + "\":" + "\"" + userId + "\"" + "," + "\"" + "id" + "\":" + "\"" + id + "\""
				+ "," + "\"" + "title" + "\":" + "\"" + title + "\"" + "," + "\"" + "body" + "\":" + "\"" + body + "}";
		return myJson;

	}

}
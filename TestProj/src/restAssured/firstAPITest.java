package restAssured;

import static org.junit.Assert.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class firstAPITest {


	public void genderValidate(String expectedGender,String name) {
		RestAssured.baseURI="https://api.genderize.io/";
//		RequestSpecification myReq=RestAssured.given();
//		myReq.queryParam("name",name);

		//Response res=myReq.get("");
		Response res=RestAssured.given().queryParam("name", name).when().get().then().extract().response();
		System.out.println(res);
		assertEquals(200,res.getStatusCode());
		assertEquals("HTTP/1.1 200 OK",res.getStatusLine());

		for(Header h:res.getHeaders()) {
			System.out.print("name="+h.getName());
			System.out.print("  value="+h.getValue());
			System.out.println();
		}
		System.out.println(res.body().asString());
		JsonPath js=res.jsonPath();
		assertEquals(expectedGender,js.getString("gender"));
		

	}

	@Test
	public void genderTest() {
		genderValidate("female","anu");
		genderValidate("male", "Arun");
	}

}

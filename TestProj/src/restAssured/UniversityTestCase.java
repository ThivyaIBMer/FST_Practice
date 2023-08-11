package restAssured;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class UniversityTestCase {

	@SuppressWarnings("rawtypes")
	public void UniversityMethod(String country,String state) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country", country).when().get("/search").then().extract().response();
		System.out.println(res.body().asString());


		JsonPath respath=res.jsonPath();
		List<Object> stateList=respath.getList("state-province");
		System.out.println("Count of University in given state is: "+stateList.size());

		int counter=0;
		for(int i=0;i<stateList.size();i++) {
			if(stateList.get(i)!=null) {
				if(stateList.get(i).equals(state)) {
					counter++;

				}
			}
		}
		System.out.println(counter);

	}

	public void checkIfUniversityExist(String University) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country", "India").when().get("/search").then().extract().response();
		System.out.println(res.body().asString());


		JsonPath respath=res.jsonPath();
		List<Object> unvList=respath.getList("name");
		System.out.println("Count of University in given state is: "+unvList.size());
		boolean found=false;
		for(int i=0;i<unvList.size();i++) {
			if(unvList.get(i)!=null) {
				if(unvList.get(i).equals(University)) {
					found=true;
					break;

				}
			}
		}
		if(found) {
			System.out.println(University+" - University is found");
		}
		else {
			System.out.println(University+" - University not found");
		}
	}

	public void fetchStateofGivenUniversity(String University) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country", "India").when().get("/search").then().extract().response();
		System.out.println(res.body().asString());


		JsonPath respath=res.jsonPath();
		List<Object> unvList=respath.getList("name");
		List<Object> stateList=respath.getList("state-province");
		System.out.println("Count of University in given state is: "+unvList.size());
		for(int i=0;i<unvList.size();i++) {
			if(unvList.get(i)!=null) {
				if(unvList.get(i).equals(University)) {
					System.out.println(stateList.get(i));
					break;

				}
			}
		}



	}

	public void validatePositiveAuthentication(String username,String password) {
		RestAssured.baseURI="https://postman-echo.com";
		Response res=RestAssured.given().auth().preemptive().basic(username, password).get("/basic-auth").then().extract().response();
		
		JsonPath respPath=res.jsonPath();
		assertEquals(true,respPath.getBoolean("authenticated"));
	}
	public void validateNegativeAuthentication(String username,String password) {
		RestAssured.baseURI="https://postman-echo.com";
		int statusCode= RestAssured.given().auth().preemptive().basic(username, password).get("/basic-auth").then().extract().response().getStatusCode();
		System.out.println(statusCode);
		assertEquals(401,statusCode);
		
	}
	public void verifyPostRequest() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String reqBody="{\"title\":\"abc\",\"body\":\"far\",\"userid\":\"101\"}";
		Response resp=RestAssured.given().body(reqBody).post("/posts").then().extract().response();
		System.out.println("StatusCode is: "+resp.getStatusCode());
		JsonPath respBody=resp.jsonPath();
		System.out.println("Id is: "+respBody.getInt("id"));
		
	}

	@Test
	public void Universitytest() {
		//UniversityMethod("India","Karnataka");
		//checkIfUniversityExist("AISECT University");
		//fetchStateofGivenUniversity("Lovely Professional University");
		//validatePositiveAuthentication("postman","password");
		//validateNegativeAuthentication("wrong","wrong");
		verifyPostRequest();

	}

}

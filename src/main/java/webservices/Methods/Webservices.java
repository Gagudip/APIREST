package webservices.Methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Webservices {

	public static Response Post(String URI, String JSON) {
		
		RequestSpecification request = RestAssured.given().body(JSON);

		request.contentType(ContentType.JSON);

		Response response = request.post(URI);
		
		System.out.println(response.asString());
		
		return response;

	}

	public static Response Get(String URI) {

		RequestSpecification request = RestAssured.given();

		request.contentType(ContentType.JSON);
		
		request.accept(ContentType.JSON);

		Response response = request.get(URI);

		return response;

	}

	public static Response Delete(String URI, String JSON) {

		RequestSpecification request = RestAssured.given().body(JSON);

		request.contentType(ContentType.JSON);

		Response response = request.delete(URI);

		return response;

	}

	public static Response Put(String URI, String JSON) {

		RequestSpecification request = RestAssured.given().body(JSON);

		request.contentType(ContentType.JSON);

		Response response = request.put(URI);

		return response;

	}

}

package updateProduct;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

import webservices.responsePOJO.ListUser;
import webservices.services.services;

public class updateproduct {

	Response response;
	services service;

	@Test
	public void listusers() {

		service = new services();

		// response = service.addProduct("444", "OIL","Natural Tea Tree", "210.0");

		response = service.Listuser();

		if (response.statusCode() == 200) {

			System.out.println(response.getBody().asString());

			Gson gson = new Gson();

			ListUser userlist = gson.fromJson(response.asString(), ListUser.class);

			System.out.println(userlist.getPage());
			System.out.println(userlist.getTotal());
			System.out.println(userlist.getTotalPages());
			System.out.println(userlist.getData().get(0).getFirstName());

		}

	}
}
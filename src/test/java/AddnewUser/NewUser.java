package AddnewUser;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

import webservices.responsePOJO.ListUser;
import webservices.responsePOJO.PostUser;
import webservices.services.services;

public class NewUser {

	Response response;
	services service;

	@Test
	public void newuser() {

		service = new services();

		// response = service.addProduct("444", "OIL","Natural Tea Tree", "210.0");

		response = service.AddUser("Gagan", "leeee");

		if (response.statusCode() == 201) {
			
			Gson gson = new Gson();
			
			System.out.println(response.asString());

		PostUser[] userlist = gson.fromJson(response.asString(), PostUser[].class);
			
		System.out.println(userlist[0].getCreatedAt());


			System.out.println(response.statusCode());

		}
	}
}

package webservices.services;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.jayway.restassured.response.Response;

import webservices.Methods.Webservices;
import webservices.requestPOJO.CreateID;
import webservices.responsePOJO.ListUser;
import webservices.utilities.EndPointURL;
import webservices.utilities.URI;

public class services {

	List<JSONObject> list;

	public Response Listuser() {

		ListUser listuser = new ListUser();

		// JSONObject jsonObj = new JSONObject(add);
		// list = new ArrayList<JSONObject>();
		// list.add(jsonObj);
		// System.out.println(list);
		System.out.println(URI.FixedURI + EndPointURL.LIST_USERS_BY_Page.getResourcePath("2"));
		// System.out.println(list.toString());

		return Webservices.Get(URI.FixedURI + EndPointURL.LIST_USERS_BY_Page.getResourcePath("2"));
	}

	public Response AddUser(String name, String job) {

		CreateID id = new CreateID();
		
	id.setName(name);
	id.setJob(job);
				JSONObject jsonobj = new JSONObject(id);
				list= new ArrayList<JSONObject>();
				list.add(jsonobj);
				return Webservices.Post(URI.FixedURI + EndPointURL.POST_USER.getResourcePath(),list.toString());
				
	}

}

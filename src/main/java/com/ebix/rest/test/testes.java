package com.ebix.rest.test;

import java.net.URI;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ebix.rest.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class testes {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String url = "http://localhost:8080/users";
//		System.out.println(getUserById(url, 5));
//		System.out.println(postUserReturnURI(url));
//		System.out.println(postUserReturnString(url));
//		postUserReturnNone(url);
//		putUserReturnNone(url, 10);
//		deleteUserReturnNone(url,11);
		
//		HttpHeaders headers = new HttpHeaders();  //criando headers
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//
//		
//		
//		HttpEntity<String> entity = new HttpEntity<>(headers); // juntando headers e tambem pode ser incluindo um body
		

		
	}
	
	public static User getUserById(String url, int id) {
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject(url + "/" +  id, User.class);
		return user;
	}

	public static URI postUserReturnURI(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<>(new User("teste", "teste@gmail.com","1234-5678", "12345"));
		URI location = restTemplate.postForLocation(url, request);
		return location;
	}
	
	public static User postUserReturnString(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<>(new User("teste", "teste@gmail.com","1234-5678", "12345"));
		User usuario = restTemplate.postForObject(url, request, User.class);
		return usuario;
	}

	public static void postUserReturnNone(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> request = new HttpEntity<>(new User("teste", "teste@gmail.com","1234-5678", "12345"));
		ResponseEntity<User> response = restTemplate.exchange(url, HttpMethod.POST, request, User.class);
		return;
	}
	
	public static void putUserReturnNone(String url, int id) {
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		User updatedInstance = new User("teste", "teste@gmail.com","1234-5678", "12345");
		String resourceUrl = url + '/' + id;
		HttpEntity<User> requestUpdate = new HttpEntity<>(updatedInstance, headers);
		restTemplate.exchange(resourceUrl, HttpMethod.PUT, requestUpdate, Void.class);
		return;
	}
	
	public static void deleteUserReturnNone(String url, int id) {
		RestTemplate restTemplate = new RestTemplate();
		String entityUrl = url + "/" + id;
		restTemplate.delete(entityUrl);
	}
	
	public JSONObject converterToJson(String str) {
		JSONObject jsonObject = new JSONObject(str);
		return jsonObject;
	}
}

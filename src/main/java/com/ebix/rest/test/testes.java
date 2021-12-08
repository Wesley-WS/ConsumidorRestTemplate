package com.ebix.rest.test;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ebix.rest.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class testes {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String url = "http://localhost:8080/users";
		System.out.println(getUserById(url, 5));
		System.out.println(postUserReturnURI(url));
		System.out.println(postUserReturnString(url));
		postUserReturnNone(url);
		putUserReturnNone(url, 10);
		deleteUserReturnNone(url,11);
//		RestTemplate restTemplate = new RestTemplate();
//		String fooResourceUrl = "https://imdb-api.com/en/API/SearchMovie/k_wieu2ati/inception2010";
//		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
//		String result = response.toString();
//		System.out.println(result);
		
//		ResponseEntity<String> teste = restTemplate.getForEntity(fooResourceUrl, String.class);
		
//		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
		
//		Listagem lista = restTemplate.getForObject(fooResourceUrl, Listagem.class);
//		System.out.println(lista.getResults().get(1).toString());
//		String pegaUsuario = "http://localhost:8080/users";
//		User user = restTemplate.getForObject(pegaUsuario + "/1", User.class);
//		System.out.println(user.getName());
		
//		RestTemplate restTemplate = new RestTemplate();

//		HttpEntity<User> request = new HttpEntity<>(new User("Bob", "teste@gmail.com","2615-6498", "12345"));
//		User usuario = restTemplate.postForObject(pegaUsuario, request, User.class);
//		System.out.println(usuario);
		
//		HttpEntity<User> requestt = new HttpEntity<>(new User("Mark", "teste@gmail.com","2615-6498", "12345"));
//		URI location = restTemplate.postForLocation(pegaUsuario, requestt);
//		System.out.println(location);
		
//		RestTemplate restTemplate = new RestTemplate();
//		HttpEntity<User> request = new HttpEntity<>(new User("Jhon", "teste@gmail.com","2615-6498", "12345"));
//		ResponseEntity<User> response = restTemplate.exchange(pegaUsuario, HttpMethod.POST, request, User.class);
//		User ussuario = response.getBody();
//		System.out.println(ussuario);
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType);
		
//		User updatedInstance = new User("Luke", "teste@gmail.com","2615-6498", "12345");
//		updatedInstance.setId(createResponse.getBody().getId());
//		String resourceUrl = pegaUsuario + '/' + "7";
//		HttpEntity<User> requestUpdate = new HttpEntity<>(updatedInstance, headers);
//		restTemplate.exchange(resourceUrl, HttpMethod.PUT, requestUpdate, Void.class);
		
//		String entityUrl = pegaUsuario + "/" + "13";
//		restTemplate.delete(entityUrl);
		
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode root = mapper.readTree(response.getBody());
//		JsonNode name = root.path("id");
//		assertThat(name.asText(), notNullValue());
//		System.out.println(response.getBody());
		
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
}

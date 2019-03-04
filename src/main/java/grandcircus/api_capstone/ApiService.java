package grandcircus.api_capstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import grandcircus.api_capstone.model.ApiResponse;
import grandcircus.api_capstone.model.EventsTm;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	// api key values stored in application.properties
	@Value("${ticketmaster.apikey}")
	private String apikey;
	
	@Value("${ticketmaster.secretkey}")
	private String secretkey;
	
	//query parameter: "size = 100" -> size parameter is included in all of these.
	public List<EventsTm> getAll(){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
<<<<<<< HEAD
=======
	//query parameter: "id" - works but only if string id is exact match
	public List<EventsTm> getById(String id){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?id=" + id + "&countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
	//query parameter: "url"
	public List<EventsTm> getByUrl(String urlQuery){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?url=" + urlQuery + "&countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
	//query parameter: "keyword"
	public List<EventsTm> filterByKeyword(String keyword){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?keyword=" + keyword + "&countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
	//query parameter: "startDateTime"
	public List<EventsTm> getByStartDateTime(String startDateTime){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?startDateTime=" + startDateTime + "T00:00:00Z&countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
	//find event by name
	
	// find event by date
	
	// find event by keyword
	
	
>>>>>>> 4d6e53b3892e847b0dec27a0ef51776ec1842574
	
}




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
	@Value("${ticketmaster.apikey}")
	private String apikey;
	
	@Value("${ticketmaster.secretkey}")
	private String secretkey;
	
	public List<EventsTm> getAll(){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	
	
	/*public String localDate getOneLocalDates() {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents().getDates().getStart().getLocalDate();
	}
	
	public List<EventsTm> getByName(){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&page=0&size=100&apikey=" + apikey;
		ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
		return apiResponse.getEmbedded().getEvents();
	}
	*/
}

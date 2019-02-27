package grandcircus.api_capstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import grandcircus.api_capstone.model.EventsTm;
import grandcircus.api_capstone.model.EventsTmResponse;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();
	@Value("${ticketmaster.apikey}")
	private String apikey;
	
	@Value("${ticketmaster.secretkey}")
	private String secretkey;
	
	public List<EventsTm> getAll(){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=" + apikey;
		EventsTmResponse allTmEvents = restTemplate.getForObject(url, EventsTmResponse.class);
		return allTmEvents.getEvents();
	}
}

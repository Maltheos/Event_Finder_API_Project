package grandcircus.api_capstone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventsTmResponse {

	@JsonProperty("events")
	private List<EventsTm> eventsTm;
	
	public List<EventsTm> getEvents() {
		return eventsTm;
	}

	
}

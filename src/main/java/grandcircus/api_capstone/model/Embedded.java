package grandcircus.api_capstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded {

	@JsonProperty("events")
	private EventsTm eventsTm;

	public EventsTm getEventsTm() {
		return eventsTm;
	}

	public void setEventsTm(EventsTm eventsTm) {
		this.eventsTm = eventsTm;
	}
	
}

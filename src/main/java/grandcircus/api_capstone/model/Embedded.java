package grandcircus.api_capstone.model;

import java.util.List;

public class Embedded {

	private List<EventsTm> events;
	
	private SingleEvent();
	

	public List<EventsTm> getEvents() {
		return events;
	}

	public void setEvents(List<EventsTm> events) {
		this.events = events;
	}
	
	public SingleEvent getSingleEvent() {
		return singleEvent;
	}
	
}

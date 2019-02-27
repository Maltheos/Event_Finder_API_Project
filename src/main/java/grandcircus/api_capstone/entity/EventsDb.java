package grandcircus.api_capstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// THIS IS THE SQL DB TABLE ENTITY, NOT THE API OBJECT
@Entity
@Table(name="events")
public class EventsDb {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
}

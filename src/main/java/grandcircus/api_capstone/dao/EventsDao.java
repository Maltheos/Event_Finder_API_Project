package grandcircus.api_capstone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import grandcircus.api_capstone.entity.EventsDb;

@Repository
@Transactional
public class EventsDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<EventsDb> findAll(){
		return em.createQuery("from EventsDb", EventsDb.class).getResultList();
	}
}

package grandcircus.api_capstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import grandcircus.api_capstone.dao.EventsDao;
import grandcircus.api_capstone.model.EventsTm;

@Controller
public class EventsController {

	@Autowired
	private EventsDao eventsDao;
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/eventlist")
	public ModelAndView eventlist() {
		List<EventsTm> eventstm; 
		eventstm = apiService.getAll();
		ModelAndView mav = new ModelAndView("eventlist", "list", eventstm);
		return mav;
	}
		
}

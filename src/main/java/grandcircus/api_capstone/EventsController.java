package grandcircus.api_capstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView eventlist(
			@RequestParam(name = "keyword", required=false) String keyword,
			@RequestParam(name = "id", required=false) String id,
			@RequestParam(name = "startDateTime", required=false) String startDateTime)
		{
		List<EventsTm> eventstm; 
		if (!keyword.isEmpty()) {
			eventstm = apiService.filterByKeyword(keyword);	
			System.out.println("filterByKeyword");
		} else if (!id.isEmpty()) {
			eventstm = apiService.getById(id);
			System.out.println("getById");
		} else if (!startDateTime.isEmpty()) {
			System.out.println("You got here");
			eventstm = apiService.getByStartDateTime(startDateTime);
			System.out.println("getByDateTime");
		} else {
			eventstm = apiService.getAll();
			System.out.println("getAll");
		}
		
//		if (!startDateTime.isEmpty()) {
//			System.out.println("You got here");
//			eventstm = apiService.getByStartDateTime(startDateTime);
//			System.out.println("getByDateTime");
//		} else {
//			eventstm = apiService.getAll();
//			System.out.println("getAll");
//		}
		
		
		ModelAndView mav = new ModelAndView("eventlist", "list", eventstm);
		return mav;
	}
		
}

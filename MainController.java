package control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BankingService;

@Controller
public class MainController {
	
	@Autowired
	private BankingService bs ;
	

    @RequestMapping("/")
    public String home() {
        return "Index"; // with resolver configured
    }
	
	@RequestMapping("/book")
	public ModelAndView person(@RequestParam("pno") int id)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("pno", id);
		bs.Booking(id);
		return mv;
	}

}

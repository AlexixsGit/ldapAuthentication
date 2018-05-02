/**
 * 
 */
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@RestController
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping(path = "profile", method = RequestMethod.GET)
	public ModelAndView Interfaces() {
		return new ModelAndView("profile");
	}
}

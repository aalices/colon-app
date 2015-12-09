package to.webapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import to.webapp.User;

@Controller
@RequestMapping("/api")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json") @ResponseBody
	public User findAll() {
		return new User("aaa", "bbb");
	}
}

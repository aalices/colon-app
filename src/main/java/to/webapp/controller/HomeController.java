package to.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import to.model.Student;
import to.model.User;

@Controller
@RequestMapping("/api")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json") @ResponseBody
	public User findAll() {
		return new Student("aaa", "bbb", "ccc", null);
	}
}

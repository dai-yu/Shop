package shop.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserControler {
	
	@RequestMapping("/login")
	public String userLogin(){
		return "/login";
	}
}

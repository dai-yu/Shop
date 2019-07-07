package shop.control;

import org.springframework.stereotype.Controller;



@Controller
public class ProductControler {
	public String selectProductList(){
		return "/index";
	}
}

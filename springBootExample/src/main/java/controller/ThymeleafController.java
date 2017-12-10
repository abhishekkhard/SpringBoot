/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.khard.service.InfoService;

/**
 * Created by abhik on 19-Aug-2017
 */

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

	@Autowired
	@Qualifier("infoServiceImpl")
	InfoService infoService;
	
	@RequestMapping("/leaves")
	public String getLeaf() {
		return "myThymeleaf";
	}
	
	@RequestMapping("/leaf")
	public String getThymeleaf(@RequestParam(value = "name") String name) {
		return "Thymeleaf";
	}

	@RequestMapping("/leafPage")
	public String getThymeleafPage(@RequestParam(value = "name") String name, Model model) {
		 model.addAttribute("name", infoService.fetchName());
		return "myThymeleaf";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	 
}


/**
 * 
 *  @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
 * 
 */


package fun.and.games;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String sayHello(){
		return "Hello world from Spring Boot" ; 
	}
}

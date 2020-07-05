package springboot.text.external.tomcat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootExtServerController {
	
	@GetMapping("/springboot/test/ext/servers/{server}")
	public String printHello(@PathVariable String server) {
		return "Hello "+server;
	}

}

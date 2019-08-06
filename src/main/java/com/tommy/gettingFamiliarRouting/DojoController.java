package com.tommy.gettingFamiliarRouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{noun}")
	public String showLocation(@PathVariable("noun") String noun) {
		if(noun.equals("dojo")) {
			return "The dojo is awesome!";
		} else if (noun.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		} else if(noun.equals("san-jose")) {
			return "SJ Dojo is the headquarters";
		} else {
			return "No dojo found";
		}
	}
}

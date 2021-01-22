package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*" ,allowedHeaders = "*" )
@RestController
public class PersonCOntri {

	@GetMapping("/bmi")
	public Person bmi (@ModelAttribute Person Q ) {
		Double bmi =  (Q.getWeight())/((Q.getHeight()/100)*(Q.getHeight()/100));
		Q.setBmi(bmi);
		return Q;
	}
}

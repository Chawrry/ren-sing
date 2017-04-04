package com.sing.ren.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sing.ren.pojo.Person;
import com.sing.ren.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> listPersons(Model model) {
		return new ResponseEntity<List<Person>>(personService.listPersons(), HttpStatus.OK);
	}
	
}

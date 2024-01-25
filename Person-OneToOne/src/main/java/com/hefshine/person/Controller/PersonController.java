package com.hefshine.person.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.person.Model.Person;
import com.hefshine.person.Service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("person")
	public Person savePerson(@RequestBody Person person)
	{
		return personService.savePerson(person);
	}
	
	@GetMapping("AllPerson")
	public List<Person> showList()
	{
	
		return personService.findAll();
	}
	
	@DeleteMapping("Personid/{id}")
	public void deletePersonInfo(@PathVariable("id")Integer id)
	{
		personService.deletePerson(id);
	}

}

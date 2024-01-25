package com.hefshine.person.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.person.Model.Person;
import com.hefshine.person.Repository.PersonRepository;
import com.hefshine.person.Service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public Person savePerson(Person person) {
		
		return personRepository.save(person);
	}

	@Override
	public List<Person> findAll() {
		
		return personRepository.findAll();
	}

	@Override
	public void deletePerson(int id) {
		
		personRepository.deleteById(id);
	}

}

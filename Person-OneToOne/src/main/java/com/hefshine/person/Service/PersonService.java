package com.hefshine.person.Service;

import java.util.List;

import com.hefshine.person.Model.Person;

public interface PersonService {
	
	public Person savePerson(Person person);
	
	public List<Person> findAll();
	
	public void deletePerson(int id);

}

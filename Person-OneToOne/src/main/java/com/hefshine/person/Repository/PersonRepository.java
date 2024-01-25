package com.hefshine.person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hefshine.person.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}

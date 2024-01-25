package com.hefshine.person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hefshine.person.Model.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer>{

}

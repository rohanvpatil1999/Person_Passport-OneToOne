package com.hefshine.person.Service;

import java.util.List;

import com.hefshine.person.Model.Passport;

public interface PassportService {
	
	public void deletePassport(int id);
	
	public Passport savePassport(Passport passport);
	
    public List<Passport> findAll();
	

}

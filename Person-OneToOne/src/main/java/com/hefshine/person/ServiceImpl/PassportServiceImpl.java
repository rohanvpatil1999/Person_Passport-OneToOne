package com.hefshine.person.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.person.Model.Passport;
import com.hefshine.person.Repository.PassportRepository;
import com.hefshine.person.Service.PassportService;

@Service
public class PassportServiceImpl implements PassportService {

	@Autowired
	PassportRepository passportRepository;
	@Override
	public Passport savePassport(Passport passport) {
		
		return passportRepository.save(passport);
	}

	@Override
	public List<Passport> findAll() {
		
		return passportRepository.findAll();
	}

	@Override
	public void deletePassport(int id) {
		
		passportRepository.deleteById(id);
	}

}

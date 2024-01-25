package com.hefshine.person.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.person.Model.Passport;
import com.hefshine.person.Service.PassportService;

@RestController
public class PassportController {
	
	@Autowired
	PassportService passportService;
	
	@PostMapping("passport")
	public Passport savePassport(@RequestBody Passport passport)
	{
		return passportService.savePassport(passport);
	}
	
	@GetMapping("showPassport")
	public List<Passport> showAll()
	{
		return passportService.findAll();
	}
	
	@DeleteMapping("Personid/{passId}")
	public void deletePassword(@PathVariable("passId")Integer passId)
	{
		passportService.deletePassport(passId);
	}

}

package com.icici.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.dao.CountryRepository;
import com.icici.entity.Country;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryRepository dao;

	@GetMapping("/helloworld")
	public String getmsg() {
		return "Hello World... i am inside oracle test restapi...";
	}
	
	@PostMapping("/add")
	public Country addCountry(@RequestBody Country country) {

		return dao.save(country);
	}

	@GetMapping("/all")
	public Iterable<Country> allCountry() {
		return dao.findAll();
	}

	@GetMapping("/{countryId}")
	public Optional<Country> countryById(@PathVariable("countryId") int countryId) {
		return dao.findById(countryId);
	}

	@PutMapping("/update")
	public Country updateCountry(@RequestBody Country country) {
		return dao.save(country);
	}

	@DeleteMapping("/{countryId}")
	public void deleteCountry(@PathVariable("countryId") int countryId) {
		dao.deleteById(countryId);
	}
}

package com.icici.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.icici.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}

package com.talentyco.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.common.entity.Country;
import com.talentyco.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}

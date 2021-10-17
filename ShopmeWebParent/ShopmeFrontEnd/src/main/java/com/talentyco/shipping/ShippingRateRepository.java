package com.talentyco.shipping;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.common.entity.Country;
import com.talentyco.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}

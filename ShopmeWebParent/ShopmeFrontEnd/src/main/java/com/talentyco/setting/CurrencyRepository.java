package com.talentyco.setting;

import org.springframework.data.repository.CrudRepository;

import com.talentyco.common.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}

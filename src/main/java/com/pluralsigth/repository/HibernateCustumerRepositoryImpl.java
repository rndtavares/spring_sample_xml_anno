package com.pluralsigth.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsigth.model.Custumer;

@Repository("custumerRepository")
public class HibernateCustumerRepositoryImpl implements CustumerRepository{

	/* (non-Javadoc)
	 * @see com.pluralsigth.repository.CustumerRepository#findAll()
	 */
	@Override
	public List<Custumer> findAll(){
		List<Custumer> custumers = new ArrayList<>();
		
		Custumer custumer = new Custumer();
		
		custumer.setFirstname("Ronaldo");
		custumer.setLastname("Tavares da Silva");
		
		custumers.add(custumer);
		
		return custumers;
	}
}

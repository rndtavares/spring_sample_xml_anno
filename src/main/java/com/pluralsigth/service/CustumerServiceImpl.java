package com.pluralsigth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsigth.model.Custumer;
import com.pluralsigth.repository.CustumerRepository;

@Service("custumerService")
public class CustumerServiceImpl implements CustumerService {

	@Autowired
	private CustumerRepository custumerRepository;

	/*
	@Autowired
	public CustumerServiceImpl(CustumerRepository custumerRepository) {
		System.out.println("We are using constructor injection");
		this.custumerRepository = custumerRepository;
	}*/

	/* (non-Javadoc)
	 * @see com.pluralsigth.service.CustumerService#findAll()
	 */
	@Override
	public List<Custumer> findAll(){
		return custumerRepository.findAll();
	}

	/*@Autowired
	public void setCustumerRepository(CustumerRepository custumerRepository) {
		System.out.println("We are using setter injection");
		this.custumerRepository = custumerRepository;
	}*/
}

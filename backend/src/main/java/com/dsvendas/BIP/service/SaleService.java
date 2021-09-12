package com.dsvendas.BIP.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsvendas.BIP.dto.SaleDTO;
import com.dsvendas.BIP.dto.SaleSuccesDTO;
import com.dsvendas.BIP.dto.SaleSumDTO;
import com.dsvendas.BIP.entities.Sale;
import com.dsvendas.BIP.repositories.SaleRepository;
import com.dsvendas.BIP.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	@Transactional(readOnly = true)
	public 	List<SaleSumDTO> amountGroupBySeller(){ 
		return repository.amountGroupBySeller() ;
		
	}
	@Transactional(readOnly = true)
	public 	List<SaleSuccesDTO> succesGroupedBySeller(){ 
		return repository.succesGroupBySeller() ;
		
	
	}
	public List<SaleSuccesDTO> succesGroupBySeller() {
		// TODO Auto-generated method stub
		return repository.succesGroupBySeller();
	}
	
	}



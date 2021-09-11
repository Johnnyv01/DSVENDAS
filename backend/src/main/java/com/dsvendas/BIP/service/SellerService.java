package com.dsvendas.BIP.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsvendas.BIP.dto.SellerDTO;
import com.dsvendas.BIP.entities.Seller;
import com.dsvendas.BIP.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream() . map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}

package com.dsvendas.BIP.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsvendas.BIP.dto.SaleDTO;
import com.dsvendas.BIP.dto.SaleSuccesDTO;
import com.dsvendas.BIP.dto.SaleSumDTO;
import com.dsvendas.BIP.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleControllers {

	@Autowired 
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
		
	}
	@GetMapping(value= "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupeBySeller() {
		List <SaleSumDTO> list = service.amountGroupBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value= "/succes-by-seller")
	public ResponseEntity<List<SaleSuccesDTO>> succesGroupBySeller() {
		List <SaleSuccesDTO> list = service.succesGroupBySeller();
		return ResponseEntity.ok(list);
	}
}

 
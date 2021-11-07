package com.alvimlops.dsvendas.controllers;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvimlops.dsvendas.dto.SaleDTO;
import com.alvimlops.dsvendas.dto.SalesSucessoDTO2;
import com.alvimlops.dsvendas.dto.SalesSumDTO;
import com.alvimlops.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity <Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.finAll( pageable);
		return ResponseEntity.ok(list);
	
	}
	
	@GetMapping (value = "/sum-by-seller")
	public ResponseEntity<List<SalesSumDTO >> amountGroupeBySeller(){
		List<SalesSumDTO> list = service.amountGroupBySeller();
		return ResponseEntity.ok(list);
		
		
	}
	
	@GetMapping (value = "/sucesso-by-seller")
	public ResponseEntity<List<SalesSucessoDTO2>> sucessoGroupeBySeller(){
		List<SalesSucessoDTO2> list = service.SucessoGroupBySeller();
		return ResponseEntity.ok(list);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

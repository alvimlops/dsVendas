package com.alvimlops.dsvendas.services;

import java.awt.print.Pageable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.alvimlops.dsvendas.dto.SaleDTO;
import com.alvimlops.dsvendas.entities.Sale;
import com.alvimlops.dsvendas.repositories.SaleRepository;
import com.alvimlops.dsvendas.repositories.SelesRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SelesRepository selesRepository;
	
	@Transactional
	public Page<SaleDTO> finAll(Pageable pageable){
		selesRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	
	
	
}

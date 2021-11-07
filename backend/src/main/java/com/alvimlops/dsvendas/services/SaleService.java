package com.alvimlops.dsvendas.services;

import java.awt.print.Pageable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.alvimlops.dsvendas.dto.SaleDTO;
import com.alvimlops.dsvendas.dto.SalesSucessoDTO2;
import com.alvimlops.dsvendas.dto.SalesSumDTO;
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
	
	@Transactional
	public List<SalesSumDTO> amountGroupBySeller(){
		return repository.amountGroupBySeller();
	}
	
	@Transactional
	public List<SalesSucessoDTO2> SucessoGroupBySeller(){
		return repository.SucessoGroupBySeller();
	}
	
	
	
}

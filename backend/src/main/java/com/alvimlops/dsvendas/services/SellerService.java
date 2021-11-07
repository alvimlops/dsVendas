package com.alvimlops.dsvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvimlops.dsvendas.dto.SellerDTO;
import com.alvimlops.dsvendas.entities.Saller;
import com.alvimlops.dsvendas.repositories.SelesRepository;

@Service
public class SellerService {
	
	@Autowired
	private SelesRepository repository;
	
	public List <SellerDTO> findAll(){  
		List<Saller> result =  repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
	
}

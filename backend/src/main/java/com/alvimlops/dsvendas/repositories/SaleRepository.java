package com.alvimlops.dsvendas.repositories;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alvimlops.dsvendas.entities.Sale;
import com.alvimlops.dsvendas.entities.Saller;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	Page<Sale> findAll(Pageable pageable);

	

	

	

}

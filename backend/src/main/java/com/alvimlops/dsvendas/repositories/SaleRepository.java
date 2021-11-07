package com.alvimlops.dsvendas.repositories;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alvimlops.dsvendas.dto.SalesSucessoDTO2;
import com.alvimlops.dsvendas.dto.SalesSumDTO;
import com.alvimlops.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	Page<Sale> findAll(Pageable pageable);

	@Query ("SELECT new com.alvimlopd.dsvendas.dto.dsvendas.dto.SalesSumDTO(obj.Saller, SUM(obj.amount))" + "FROM Sale AS obj GROUP BY obj.Saller")
	List<SalesSumDTO> amountGroupBySeller();

	@Query ("SELECT new com.alvimlops.dsvendas.dto.SalesSucessoDTO2;(obj.Saller, SUM (obj.visited), SUM (obj.deals)" + "FROM Sale AS obj GROUP BY obj.Saller")
	List<SalesSucessoDTO2> SucessoGroupBySeller();
	

	

}

package com.alvimlops.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvimlops.dsvendas.entities.Saller;

public interface SelesRepository extends JpaRepository<Saller, Long> {

	List<Saller> findAll();

	

	

}

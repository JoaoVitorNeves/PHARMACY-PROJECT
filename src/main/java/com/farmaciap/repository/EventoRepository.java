package com.farmaciap.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.farmaciap.models.Evento;

public interface EventoRepository extends CrudRepository<Evento,String> {
	@Query("Select u from Evento u where u.cns = ?1")
	Iterable<Evento> findByCns(Long cns);	
	//Evento findByCns(long cns);

}

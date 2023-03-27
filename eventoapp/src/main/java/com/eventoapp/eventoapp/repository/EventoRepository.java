package com.eventoapp.eventoapp.repository;


import org.springframework.data.repository.CrudRepository;

import com.eventoapp.eventoapp.model.Evento;




public interface EventoRepository extends CrudRepository<Evento, String> {
	
}

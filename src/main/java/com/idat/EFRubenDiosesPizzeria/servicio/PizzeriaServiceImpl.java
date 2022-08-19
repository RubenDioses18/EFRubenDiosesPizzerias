package com.idat.EFRubenDiosesPizzeria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFRubenDiosesPizzeria.repository.PizzeriaRepository;
import com.idat.EFRubenDiosesPizzeria.model.Pizzeria;

public class PizzeriaServiceImpl implements PizzeriaService {

	
	@Autowired(required = false)
	private PizzeriaRepository repository;
	
	@Override
	public List<Pizzeria> listarPizzeria() {
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerPizzeria() {
		return null;
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repository.save(pizzeria);

	}

}

package com.idat.EFRubenDiosesPizzeria.servicio;

import java.util.List;

import com.idat.EFRubenDiosesPizzeria.model.Pizzeria;

public interface PizzeriaService {
	
	public List<Pizzeria> listarPizzeria();
	public Pizzeria obtenerPizzeria();
	public void guardarPizzeria(Pizzeria pizzeria);

}

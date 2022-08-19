package com.idat.EFRubenDiosesPizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFRubenDiosesPizzeria.model.Pizzeria;
import com.idat.EFRubenDiosesPizzeria.servicio.PizzeriaService;

@Controller
@RequestMapping("/api/v1/pizzeria")
public class PizzeriaController {
	
	@Autowired(required = false)
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listarPizzeria(){
		return service.listarPizzeria();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizzeria obtenerPizzeria(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizzeria(@RequestBody Pizzeria pizzeria) {
		service.guardarPizzeria(pizzeria);
	}


}

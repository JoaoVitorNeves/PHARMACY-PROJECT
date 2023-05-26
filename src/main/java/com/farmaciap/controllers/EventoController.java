package com.farmaciap.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.farmaciap.models.Evento;
import com.farmaciap.repository.EventoRepository;

@Controller

public class EventoController {
	@Autowired
	private EventoRepository er ;
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.GET)
	public String fort() {
		return"formEvento.html";
	}
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.POST)
	public String fort(Evento evento) {
		
		er.save(evento);
		return"redirect:/cadastrarEvento";
	}
	@RequestMapping("/listTodos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("listaAllUsers");
		Iterable<Evento> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		return mv;
		
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String detalhePaciente() {
		return"index";
	}
	/*@RequestMapping("/{csn}")
	public ModelAndView detalhePacientes(@PathVariable("cns")long cns) {
		Evento evento = er.findByCns(cns);
		ModelAndView mv = new ModelAndView("detalhePacientes");
		mv.addObject("evento", evento);
		return mv;
	}*/
	@PostMapping("/pesquisarpessoa")
	public ModelAndView pesquisar(@RequestParam("cns") Long cns) {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("eventos", er.findByCns(cns));
		return mv;
	}
	
}


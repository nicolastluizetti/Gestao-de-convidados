package com.ntl.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ntl.festa.model.Convidado;
import com.ntl.festa.model.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelandview = new ModelAndView("ListaConvidados");
		
		modelandview.addObject("convidados",convidados.findAll());
		modelandview.addObject(new Convidado());
		return modelandview;
	}
	
	@PostMapping("/convidados")
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}

}

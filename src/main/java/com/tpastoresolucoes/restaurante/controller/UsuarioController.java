package com.tpastoresolucoes.restaurante.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpastoresolucoes.restaurante.model.entity.Usuario;
import com.tpastoresolucoes.restaurante.model.service.UsuarioService;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService servicoUsuario;
	
	@GetMapping
	ResponseEntity<List<Usuario>> findAll() {
		
		List<Usuario> listaUsuario = servicoUsuario.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}

	@GetMapping(value="/{id}")
	ResponseEntity<Usuario> findById(@PathVariable Long id) {
		
		Usuario usuario = servicoUsuario.findById(id);
		return ResponseEntity.ok().body(usuario);
	}
}

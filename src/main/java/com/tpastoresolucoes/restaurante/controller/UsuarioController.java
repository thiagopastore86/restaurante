package com.tpastoresolucoes.restaurante.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpastoresolucoes.restaurante.model.entity.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@GetMapping
	ResponseEntity<Usuario> findAll() {
		Usuario usu = Usuario.builder().login("thiago").senha("123").build();
		return ResponseEntity.ok().body(usu);
	}

}

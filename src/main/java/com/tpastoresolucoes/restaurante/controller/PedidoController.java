package com.tpastoresolucoes.restaurante.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpastoresolucoes.restaurante.model.entity.Pedido;
import com.tpastoresolucoes.restaurante.model.service.PedidoService;


@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

	@Autowired
	private PedidoService servicoPedido;
	
	@GetMapping
	ResponseEntity<List<Pedido>> findAll() {
		
		List<Pedido> listaPedido = servicoPedido.findAll();
		return ResponseEntity.ok().body(listaPedido);
	}

	@GetMapping(value="/{id}")
	ResponseEntity<Pedido> findById(@PathVariable Long id) {
		
		Pedido pedido = servicoPedido.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
}

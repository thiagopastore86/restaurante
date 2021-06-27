package com.tpastoresolucoes.restaurante.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpastoresolucoes.restaurante.model.entity.Pedido;
import com.tpastoresolucoes.restaurante.model.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repositorioPedido;
	
	public List<Pedido> findAll() {		
		return repositorioPedido.findAll();		
	}
	
	public Pedido findById(Long id) {		
		Optional<Pedido> obj = repositorioPedido.findById(id);		
		return obj.get();		
	}	
	

}

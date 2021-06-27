package com.tpastoresolucoes.restaurante.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tpastoresolucoes.restaurante.model.entity.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	
}

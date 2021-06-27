package com.tpastoresolucoes.restaurante.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tpastoresolucoes.restaurante.model.entity.Pedido;
import com.tpastoresolucoes.restaurante.model.entity.Usuario;
import com.tpastoresolucoes.restaurante.model.repository.PedidoRepository;
import com.tpastoresolucoes.restaurante.model.repository.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
    
	@Autowired
	private UsuarioRepository repUsuario;
	
	@Autowired
	private PedidoRepository repPedido;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = Usuario.builder().login("thiago").senha("123456").dataCriacao(Instant.now()).build();
		Usuario u2 = Usuario.builder().login("fabi").senha("854qwe").dataCriacao(Instant.now()).build();
		Usuario u3 = Usuario.builder().login("mae").senha("abcde").dataCriacao(Instant.now()).build();
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), u1); 
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), u2); 
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), u1); 
		
		repUsuario.saveAll(Arrays.asList(u1,u2,u3));
		repPedido.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}

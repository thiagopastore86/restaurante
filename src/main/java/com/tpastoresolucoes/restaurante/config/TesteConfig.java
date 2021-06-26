package com.tpastoresolucoes.restaurante.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tpastoresolucoes.restaurante.model.entity.Usuario;
import com.tpastoresolucoes.restaurante.model.repository.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
    
	@Autowired
	private UsuarioRepository repositorio;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = Usuario.builder().login("thiago").senha("123456").build();
		Usuario u2 = Usuario.builder().login("fabi").senha("123456").build();
		Usuario u3 = Usuario.builder().login("mae").senha("123456").build();
		
		repositorio.saveAll(Arrays.asList(u1,u2,u3));
	}
	
}

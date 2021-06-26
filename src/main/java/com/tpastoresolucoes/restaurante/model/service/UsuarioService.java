package com.tpastoresolucoes.restaurante.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpastoresolucoes.restaurante.model.entity.Usuario;
import com.tpastoresolucoes.restaurante.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorioUsuario;
	
	public List<Usuario> findAll() {		
		return repositorioUsuario.findAll();		
	}
	
	public Usuario findById(Long id) {		
		Optional<Usuario> obj = repositorioUsuario.findById(id);		
		return obj.get();		
	}	
	

}

package com.tpastoresolucoes.restaurante.model.entity;

import java.io.Serializable;
//import java.time.LocalDateTime;

import javax.persistence.Column;
//import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario", schema = "prest")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="login")
	@NonNull
	private String login;
	
	@Column(name="senha")
	@NonNull
	private String senha;
	
	//@Column(name="data_atualizacao")
	//@Convert(converter=Jsr310JpaConverters.LocalDateConverter.class)
	//private LocalDateTime dataAtualizacao;

}

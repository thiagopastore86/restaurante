package com.tpastoresolucoes.restaurante.model.entity;

import java.io.Serializable;
//import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
//import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario", schema = "prest")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
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
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Pedido> pedidos;
	
	
	//@Column(name="data_atualizacao")
	//@Convert(converter=Jsr310JpaConverters.LocalDateConverter.class)
	//private LocalDateTime dataAtualizacao;

}

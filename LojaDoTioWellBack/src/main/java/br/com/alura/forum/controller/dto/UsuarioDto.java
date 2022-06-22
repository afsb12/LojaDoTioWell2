package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.Usuario;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDto {

	private Long id;
	private String nome;
	private String celular;
	private String email;
	private String senha;

	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.celular = usuario.getCelular();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCelular() {
		return celular;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}

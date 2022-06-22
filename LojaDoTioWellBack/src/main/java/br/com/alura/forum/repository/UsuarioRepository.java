package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	List<Usuario> findByNome(String nome);

}

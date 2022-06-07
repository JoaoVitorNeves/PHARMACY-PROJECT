package br.com.criandoaoi.projeto.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.criandoaoi.projeto.settigns.Usuario;

public interface IUsuario extends JpaRepository<Usuario,Integer>{

	
}

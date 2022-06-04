package br.com.criandoaoi.projeto.DAO;
import org.springframework.data.repository.CrudRepository;

import br.com.criandoaoi.projeto.settigns.Usuario;

public interface IUsuario extends CrudRepository<Usuario,Integer>{

	
}

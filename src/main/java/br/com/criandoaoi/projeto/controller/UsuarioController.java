package br.com.criandoaoi.projeto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoaoi.projeto.DAO.IUsuario;
import br.com.criandoaoi.projeto.settigns.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController 
{
	@Autowired
	private IUsuario dao;
	
	 @GetMapping
	  Iterable<Usuario> listaUsuarios() {
			return   dao.findAll(); 
		}
	 
	 @PostMapping
	 public Usuario criarUsuario(@RequestBody Usuario usuario ) {
		 Usuario usuarioNovo = dao.save(usuario);
		 return usuarioNovo;
	 }
	 @PutMapping
	 public Usuario editarUsuario(@RequestBody Usuario usuario ) {
		 Usuario usuarioNovo = dao.save(usuario);
		 return usuarioNovo;
		 }
	 
	
	@DeleteMapping("/{id}")
	public Optional<Usuario> excluirUsuario(@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		dao.deleteById(id);
		return usuario;
	}
	 
	
	
	
	
	
}

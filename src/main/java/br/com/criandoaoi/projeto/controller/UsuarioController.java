package br.com.criandoaoi.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.criandoaoi.projeto.repository.IUsuario;
import br.com.criandoaoi.projeto.service.UsuarioService;
import br.com.criandoaoi.projeto.settigns.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController 
{
	@Autowired
	private IUsuario dao;
	private UsuarioService usuarioService;
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	 @GetMapping
	 public ResponseEntity <List<Usuario>> listaUsuarios() {
		     
		    return	ResponseEntity.status(200).body(usuarioService.listarUsuario());
		}
	 
	 @PostMapping
	 public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario ) {
		 Usuario usuarioNovo = dao.save(usuario);
		 return ResponseEntity.status(201).body(usuarioNovo);
	 }
	 @PutMapping
	 public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario ) {
		 return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
		 }
	 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		dao.deleteById(id);
		return ResponseEntity.status(204).build();
	}
	 
	
	
	
	
	
}

package br.com.criandoaoi.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.criandoaoi.projeto.repository.IUsuario;
import br.com.criandoaoi.projeto.settigns.Usuario;
@Service
public class UsuarioService {
	
	private IUsuario repository;
	
	public UsuarioService(IUsuario repository) {
		this.repository = repository = repository;
	}
	
	public List<Usuario>listarUsuario(){
		List<Usuario> lista = repository.findAll();
		return lista;
		
		
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
		
	}
	
}

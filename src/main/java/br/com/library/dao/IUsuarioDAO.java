package br.com.library.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.library.model.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Integer>{
	public Usuario findByEmailOrSenha(String email, String senha);
}

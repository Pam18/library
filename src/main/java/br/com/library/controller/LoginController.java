package br.com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.library.dao.IUsuarioDAO;
import br.com.library.dto.LoginSimplesDTO;
import br.com.library.util.General;

@RestController
@CrossOrigin("*")
public class LoginController {
	
	General util;
	
	@Autowired
	private IUsuarioDAO dao;
	
	@GetMapping("/login")
	public ResponseEntity<?> login() {
		return ResponseEntity.status(200).body("hello");
	}

	@GetMapping("/login/{id}")
	@SuppressWarnings("static-access")
	public ResponseEntity<?> logarId(@PathVariable String id, @RequestBody(required = false) LoginSimplesDTO body) {

		if (util.isExist(body) && util.isExist(body.getEmail(), body.getSenha())) {
			return ResponseEntity.status(200).body("O usuario de código "+id+" está logado!");
		}
		return ResponseEntity.status(400).body("Usuario ou senha incorreto!");
//		String res = (util.isExist(body.getEmail()) != true) ? "": " " + body.getEmail() ;
//		System.out.print(res);
//		return ResponseEntity.status(200).body(id +" "+ res);
		//		String res = (body.getEmail() != null) ? " " + body.getEmail() : "";

		
	}
}

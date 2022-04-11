package br.com.library.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.library.dto.LoginSimplesDTO;

@RestController
@CrossOrigin("*")
public class LoginController {

	@GetMapping("/login")
	public ResponseEntity<?> login() {
		return ResponseEntity.status(201).body("hello");
	}

	@GetMapping("/login/{id}")
	public ResponseEntity<?> logarId(@PathVariable String id, @RequestBody(required = false) LoginSimplesDTO body) {
		String res = (body != null) ? " " + body.getEmail() : "";
		
		return ResponseEntity.status(200).body(id + res);
	}
}

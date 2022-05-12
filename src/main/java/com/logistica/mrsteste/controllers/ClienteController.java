package com.logistica.mrsteste.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.mrsteste.entities.Cliente;
import com.logistica.mrsteste.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable (value = "id") Long id) {
		Optional<Cliente> cliente = repository.findById(id);
		return new ResponseEntity(cliente.get(), HttpStatus.OK);
		
	}
	
	

}

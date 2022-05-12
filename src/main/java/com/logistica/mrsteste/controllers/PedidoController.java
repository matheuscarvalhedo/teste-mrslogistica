package com.logistica.mrsteste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.mrsteste.entities.Pedido;
import com.logistica.mrsteste.repositories.PedidoRepository;

@RestController
@RequestMapping(value = "/compras")
public class PedidoController {
	
	@Autowired
	private PedidoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/sortByProduto")
	public ResponseEntity<List<Pedido>> findOrderByProduto() {
		List<Pedido> result = repository.findAll(Sort.by(Sort.Direction.ASC, "produto"));
		return ResponseEntity.ok(result);
	}
	
}

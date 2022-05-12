package com.logistica.mrsteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.mrsteste.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	//public List<Pedido> findByOrderByPreco();

}

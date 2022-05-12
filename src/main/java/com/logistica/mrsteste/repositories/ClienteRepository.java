package com.logistica.mrsteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.mrsteste.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

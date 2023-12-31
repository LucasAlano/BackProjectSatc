package com.satc.com.satc.repository;

import com.satc.com.satc.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, CustomQuerydslPredicateExecutor<Cliente> {
}

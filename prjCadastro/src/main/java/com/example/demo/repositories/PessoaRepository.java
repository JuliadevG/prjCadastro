package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
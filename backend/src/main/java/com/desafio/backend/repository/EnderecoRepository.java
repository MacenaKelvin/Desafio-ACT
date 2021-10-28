package com.desafio.backend.repository;

import com.desafio.backend.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}

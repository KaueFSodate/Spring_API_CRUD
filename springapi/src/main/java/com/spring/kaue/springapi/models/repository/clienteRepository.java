package com.spring.kaue.springapi.models.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.kaue.springapi.models.entity.cliente;

public interface clienteRepository extends JpaRepository<cliente, Integer>{
    
    // Query para buscar pelo id
    @Query(value = "SELECT *FROM cliente WHERE id = :id", nativeQuery = true)
    Optional<cliente> FindByIDTop(int id);

    // Query para buscar pelo nome e nascimento
    @Query(value = "SELECT *FROM cliente WHERE nome = :nome AND nascimento = :nascimento", nativeQuery = true)
    Optional<cliente> FindByNomeAndSenha(String nome, String nascimento);

}

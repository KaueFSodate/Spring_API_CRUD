package com.spring.kaue.springapi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kaue.springapi.models.entity.cliente;
import com.spring.kaue.springapi.models.repository.clienteRepository;

@RestController
@RequestMapping("/api")
public class clienteController {

    @Autowired
    private clienteRepository ClienteRepository;

    // Mostrar os clientes
    @GetMapping("/listar")
    public Iterable<cliente> listar(){
        Iterable<cliente> Clientes = ClienteRepository.findAll();
        return Clientes;
    }

    // Mostrar os clientes por id
    @GetMapping("/listarId")
    public Optional<cliente> listarId(@RequestParam int id){
        Optional<cliente> Cliente = ClienteRepository.FindByIDTop(id);
        return Cliente;
    }

    // Mostrar os clientes por nome e email
    @GetMapping("/listarUser")
    public Optional<cliente> listarNomeESenha(@RequestParam String nome, String nascimento){
        Optional<cliente> Cliente = ClienteRepository.FindByNomeAndSenha(nome, nascimento);

        if(Cliente != null){
            System.out.println("Tem cliente");
        }else{
            System.out.println("Não tem cliente");
        }
        return Cliente;
        
    } 


    

    // Cadastrar os clientes
    @PostMapping("/cadastrar")
    public void cadastrar(cliente Cliente){
        ClienteRepository.save(Cliente);
    }

    // Deletar os clientes
    @PostMapping("/deletar{id}")
    public void deletar(@RequestParam int id){
        ClienteRepository.deleteById(id);
    }

    // Editar os clientes
    @PutMapping("/editar")
    public void Editar(cliente Cliente){
        ClienteRepository.save(Cliente);
    }

    
}

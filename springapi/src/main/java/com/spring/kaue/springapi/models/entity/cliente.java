package com.spring.kaue.springapi.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id do cliente ira ser unico e ter um aout increment.
    int id;

    String nome;

  
    String email;

 
    String fone;
    
   
    String nascimento;

    public cliente() {
    }

    public cliente(int id) {
        this.id = id;
    }

    public cliente(int id, String nome, String email, String fone, String nascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.nascimento = nascimento;
    }

    public cliente(String nome, String email, String fone, String nascimento) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.nascimento = nascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}

package com.reportingservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Denunciante {

    @Id
    private Long id;
    private String nome;
    private String cpf;

    public Denunciante(){

    }
    public Denunciante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

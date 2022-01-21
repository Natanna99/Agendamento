/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.util.ArrayList;

/**
 *
 * @author Natanna
 */
public class Cliente {
    private String nome;
    private String CPF;
    ArrayList<Cliente> clientes = new ArrayList();
    
    public Cliente(){
    }
    
    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    
    public String getCpf(){
        return CPF;
    }
    
    public void setCpf(String CPF){
        this.CPF= CPF;
    }
    
    public void criarCliente(String nome, String CPF){
        clientes.add(new Cliente(nome, CPF));       
    }

    public ArrayList<Cliente> listarCliente(){
        return clientes;
    }
    
    public boolean removerCliente(Cliente c){
        return clientes.remove(c);
    }

    public Cliente pesquisarCliente(String cpf){
        for(Cliente c: clientes){
            if(c.getCpf().equalsIgnoreCase(cpf)){
                return c;
            }
        }
        return null;
    }
    
    public void atulizarCliente(String pesquisa, String nome, String cpf){
        pesquisarCliente(pesquisa).setNome(nome);
        pesquisarCliente(pesquisa).setCpf(cpf);
    }
}





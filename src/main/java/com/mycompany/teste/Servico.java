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
public class Servico {
    private int codigo;
    private String descricao;
    private double valor;
    ArrayList<Servico> servicos = new ArrayList();
    
    public Servico(){
    }
    
    public Servico(int codigo, String descricao, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void criarServico(int codigo, String descricao, double valor){
        servicos.add(new Servico(codigo, descricao, valor));       
    }

    public ArrayList<Servico> listarServico(){
        return servicos;
    }
    
    public boolean removeServico(Servico s){
        return servicos.remove(s);
    }

    public Servico pesquisarServico(int codigo){
        for(Servico s: servicos){
            if(s.getCodigo()== codigo){
                return s;
            }
        }
        return null;
    }
    
    public void atulizarServico(int pesquisa, String descricao, double valor){
        pesquisarServico(pesquisa).setDescricao(descricao);
        pesquisarServico(pesquisa).setValor(valor);
    }
}

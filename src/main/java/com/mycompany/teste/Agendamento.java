/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Natanna
 */
public class Agendamento {
    private Date dataHora = new Date();
    private String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHora);
    private String hora = new SimpleDateFormat("HH:mm").format(dataHora);
    private String observacao;
    private Cliente cliente;
    private Servico servico;
    ArrayList<Agendamento> agendamentos = new ArrayList();
    
    public Agendamento(){
    }

    public Agendamento(String data, String hora, String observacao, Cliente cliente, Servico servico) {
        this.data = data;
        this.hora = hora;
        this.observacao = observacao;
        this.cliente = cliente;
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public void criarAgendamento(String data, String hora, String observacao, Cliente cliente, Servico servico){
        agendamentos.add(new Agendamento(data, hora, observacao, cliente, servico));       
    }

    public ArrayList<Agendamento> listarAgedamentos(){
        return agendamentos;
    }
    
    public ArrayList<Agendamento> listarAgedamentosDataValor(String data, double valor){
        ArrayList<Agendamento> agendamentosDataValor = new ArrayList();
        for(Agendamento a: agendamentos){
            if(a.getData()== data && a.getServico().getValor()== valor){
                agendamentosDataValor.add(a);
            }
        }
        return agendamentosDataValor;
    }
    
    public ArrayList<Agendamento> sumarizacaoAgendamento(String data, String hora, String cliente){
        ArrayList<Agendamento> sumario = new ArrayList();
        for(Agendamento a: agendamentos){
            if(a.getData()== data && a.getHora()==hora && a.getCliente().getNome()== cliente){
                sumario.add(a);
            }
        }
        return sumario;
    }
    
    public Agendamento pesquisarAgendamentoCliente(String nome){
        for(Agendamento ag: agendamentos){
            if(ag.getCliente().getNome() == nome){
                return ag;
            }
        }
        return null;
    }
    
    public void atulizarDataAgendamento(String pesquisaNome, String data){
        pesquisarAgendamentoCliente(pesquisaNome).setData(data);
    }
    
}

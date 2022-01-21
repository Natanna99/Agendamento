/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Natanna
 */
public class Executavel {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Cliente c = new Cliente();
        System.out.println("Digite nome: ");
        String nome= input.next();
        System.out.println("Digite CPF: ");
        String cpf= input.next();
        c.criarCliente(nome, cpf);
       
        System.out.println("Digite nome: ");
        String nome2= input.next();
        System.out.println("Digite CPF: ");
        String cpf2= input.next();
        c.criarCliente(nome2, cpf2);

         /***
        for (Cliente a : c.listarCliente()) {
            System.out.println(a.getNome() + " " + a.getCpf());
        }
        
        for (Cliente a : c.listarCliente()) {
            System.out.println("Digite Nome ou CPF para excluir: ");
            String deleNome = input.next();
            if(a.getNome().equalsIgnoreCase(deleNome)|| a.getNome().equalsIgnoreCase(deleNome) ){
                c.removeCliente(a);
            }
        }
        
        for (Cliente a : c.listarCliente()) {
            System.out.println(a.getNome() + " " + a.getCpf());
        }
        
        
       
        System.out.println("Digite Nome ou CPF para atualizar: ");
        String deleNome = input.next();
        System.out.println(c.pesquisarCliente(deleNome).getNome());
        System.out.println("Atualizar nome: ");
        String a = input.next();
        System.out.println("Atualizar cpf: ");
        String b = input.next();
        c.atulizarCliente(deleNome,a,b); 

        for (Cliente d : c.listarCliente()) {
            System.out.println(d.getNome() + " " + d.getCpf());
        }
        **/
       
        Servico s = new Servico();
        s.criarServico(0, "TESTE TESTE TESTE TESTE", 0.79);
        
        Agendamento a = new Agendamento();
        a.criarAgendamento("18/01/2022", "14:38", "OBSERVAÇÂO", c.listarCliente().get(0), s.listarServico().get(0));
        a.criarAgendamento("18/01/2022", "14:38", "KRLLLLLLLLL", c.listarCliente().get(1), s.listarServico().get(0));
        a.criarAgendamento("19/01/2022", "19:38", "KRLLLLLLLLL", c.listarCliente().get(1), s.listarServico().get(0));
        
      
        for (Agendamento ag : a.listarAgedamentos()) {
            System.out.println(ag.getData() + " " + " " + ag.getHora()+ " " +ag.getObservacao()+ " " + ag.getCliente().getNome()+ " " + ag.getCliente().getCpf() + " " + ag.getServico().getDescricao()+ " " + ag.getServico().getValor());
        }
        
        var lista = a.listarAgedamentosDataValor("19/01/2022", 0.79);
        System.out.println("LISTA\n");
        for (Agendamento l : lista) {
            System.out.println(l.getData() + " " + l.getHora()+ " " +l.getObservacao()+ " " + l.getCliente().getNome()+ " " + l.getCliente().getCpf() + " " + l.getServico().getDescricao()+ " " + l.getServico().getValor());
        }
        
    }   
}

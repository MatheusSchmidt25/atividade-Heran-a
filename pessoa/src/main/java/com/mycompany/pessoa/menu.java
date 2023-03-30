/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;
import java.util.Date;
/**
 *
 * @author aluno
 */
public class menu {
    public static void main(String[]args){
        aluno i = new aluno("Jose Francisco", "123.456.789.00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+i.nome);
        System.out.println("CPF: "+i.cpf);
        System.out.println("Data de nascimento: "+i.dataNascimento.toString());
        
        System.out.println("==================================================================================");
        
        professor a = new professor("Matheus Schmidt", "987.654.321.00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+a.nome);
        System.out.println("CPF: "+a.cpf);
        System.out.println("Data de nascimento: "+a.dataNascimento.toString());
        
         System.out.println("==================================================================================");
         
        funcionario b = new funcionario("Cu no uno", "555.444.333.00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: "+b.nome);
        System.out.println("CPF: "+b.cpf);
        System.out.println("Data de nascimento: "+b.dataNascimento.toString());
    }
}

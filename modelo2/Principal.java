/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Autor at01 = new Autor();
        Autor at02 = new Autor();
        Livro lv01 = new Livro();

        at01.setNome("Thiago");
        at01.setAnoNasc(2000);
        at01.setEmail("TT@gmail.com");

        at02.setNome("Gabi");
        at02.setAnoNasc(1999);
        at02.setEmail("gabi@gmail.com");
        
        lv01.setTitulo("POO");
        lv01.setAno(2018);
        lv01.setEditora("ABC");
        
        at01.setObra(lv01);
        at02.setObra(lv01);
        lv01.setEscritores(at01);
        lv01.setEscritores(at02);
 
        
       System.out.println("O Autor "+at01.getNome()+" escreve o Livro: "+at01.getObra().getTitulo());
        
       lv01.getEscritores();
    }

}

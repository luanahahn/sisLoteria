/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sisloteria;
import java.util.*;

/**
 *
 * @author Luana
 */
    class Apostador{
        private String nome;
        private String cpf;
        private List<Integer> numerosApostados;
    
    public Apostador(String nome, List<Integer> numerosApostados, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.numerosApostados = numerosApostados;
    }
    //getters
    public String getNome(){
        return nome;
    }
    
    public List<Integer> getNumerosApostados(){
        return numerosApostados;
        }
    public String getCPF(){
        return cpf;
    }
    }
class Aposta{
    private static int nextId = 1000;
    private int id;
    private Apostador apostador;
    
    public Aposta(Apostador apostador){
        this.id = nextId++;
        this.apostador = apostador;
    }
    
    //getters
}


class Loteria{
    private List<Aposta> apostas;
    private List<Integer> numerosSorteados;
    private int rodadas;
    
    public Loteria(){
        apostas = new ArrayList<>();
        numerosSorteados = new ArrayList<>();
        rodadas = 0;
    }
    
    public void iniciarNovaEdicao(){
        apostas.clear();
        numerosSorteados.clear();
        rodadas = 0;
    }
    
    public void registrarNovaAposta(Apostador apostador){
        //imp
    }
    // finaliza a fase de apostas e realiza o sorteio
    public void finalizarApostas(){
        //imp
    }
    
    public void fimApuracao(){
        //imp
    }
    
    public void premiacao(){
        //imp
    }
    
}


public class SisLoteria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

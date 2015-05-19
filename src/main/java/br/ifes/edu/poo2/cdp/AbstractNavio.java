/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import java.util.Random;

/**
 *
 * @author Jordan-Not
 */
public abstract class AbstractNavio implements Navio{
    protected int capacidadePessoa;
    protected int capacidadeCarga;
    protected Random random;

    public AbstractNavio() {
        random = new Random();
    }   
    
    @Override
    public abstract int getCarga();
    
    @Override
    public abstract int getPassageiro();
    
    @Override
    public Object clone(){
        Object obj = null;
        
        try{
            obj = super.clone();
        }
        catch(CloneNotSupportedException x){
            System.out.println(x.getMessage());
        }
        
        return obj;
    }
    
    @Override
    public String toString(){
        return "Quantidade de passageiros: " + getPassageiro() + " | Quantidade Carga: " + getCarga() + " Toneladas";
    }
    
}

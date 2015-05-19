/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

/**
 *
 * @author Jordan-Not
 */
public interface Navio extends Cloneable{    
    
    public int getCarga();
    public int getPassageiro();
    
    public Object clone();    
}

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
public enum FactoryCruzeiro implements FactoryNavio{
    FACTORY_CRUZEIRO;
    
    private Navio cruzeiro;   

    @Override
    public synchronized Navio criarNavio() {
        if(cruzeiro == null){
            cruzeiro = new NavioCruzeiro();
            return cruzeiro;
        }
        return (Navio) cruzeiro.clone();
    }
}

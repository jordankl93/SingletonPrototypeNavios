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
public enum FactoryCargaGeral implements FactoryNavio{
    FACTORY_CARGA_GERAL;
    
    private Navio cargaGeral;
    
    @Override
    public synchronized Navio criarNavio() {
        if(cargaGeral == null){
            cargaGeral = new NavioCargaGeral();
            return cargaGeral;
        }
        return (Navio) cargaGeral.clone();
    }    
}

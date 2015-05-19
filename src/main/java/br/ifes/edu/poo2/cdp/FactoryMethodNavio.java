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
public class FactoryMethodNavio {

    public static Navio criarNavio(TipoNavio tipoNavio){
        FactoryNavio fabricaNavio;
        
        if(tipoNavio.equals(TipoNavio.CARGA_GERAL))
            fabricaNavio = FactoryCargaGeral.FACTORY_CARGA_GERAL;
        else
            if(tipoNavio.equals(TipoNavio.GRANELEIRO))
                fabricaNavio = FactoryGraneleiro.FACTORY_GRANELEIRO;
            else
                if(tipoNavio.equals(TipoNavio.CRUZEIRO))
                    fabricaNavio = FactoryCruzeiro.FACTORY_CRUZEIRO;
                else
                    fabricaNavio = FactoryEscuna.FACTORY_ESCUNA;                   
        
        return fabricaNavio.criarNavio();
    }    
    
}

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
            fabricaNavio = new FactoryCargaGeral();
        else
            if(tipoNavio.equals(TipoNavio.GRANELEIRO))
                fabricaNavio = new FactoryGraneleiro();
            else
                if(tipoNavio.equals(TipoNavio.CRUZEIRO))
                    fabricaNavio = new FactoryCruzeiro();
                else
                    fabricaNavio = new FactoryEscuna();                   
        
        return fabricaNavio.criarNavio();
    }    
    
}

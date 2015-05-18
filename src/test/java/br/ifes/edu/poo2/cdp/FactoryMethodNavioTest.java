/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class FactoryMethodNavioTest {    
    
    @Before
    public void before() {
    }

    /**
     * Test of criarNavio method, of class AbstractNavioFactory.
     */
    @Test
    public void testCriarNavioEscuna() {
        System.out.println("criarNavioEscuna");
        TipoNavio tipoNavio = TipoNavio.ESCUNA;
        Navio expResult = new NavioEscuna();
        Navio result = FactoryMethodNavio.criarNavio(tipoNavio);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarNavioCargaGeral() {
        System.out.println("criarNavioCargaGeral");
        TipoNavio tipoNavio = TipoNavio.CARGA_GERAL;
        Navio expResult = new NavioCargaGeral();
        Navio result = FactoryMethodNavio.criarNavio(tipoNavio);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarNavioGraneleiro() {
        System.out.println("criarNavioGraneleiro");
        TipoNavio tipoNavio = TipoNavio.GRANELEIRO;
        Navio expResult = new NavioGraneleiro();
        Navio result = FactoryMethodNavio.criarNavio(tipoNavio);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
    @Test
    public void testCriarNavioCruzeiro() {
        System.out.println("criarNavioCruzeiro");
        TipoNavio tipoNavio = TipoNavio.CRUZEIRO;
        Navio expResult = new NavioCruzeiro();
        Navio result = FactoryMethodNavio.criarNavio(tipoNavio);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}

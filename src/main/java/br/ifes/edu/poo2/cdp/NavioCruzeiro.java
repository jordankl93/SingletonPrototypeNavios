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
public class NavioCruzeiro extends AbstractNavio{

    public NavioCruzeiro() {
        capacidadeCarga = 0;
        capacidadePessoa = random.nextInt(500);
    }
    
    @Override
    public int getCarga() {
        return capacidadeCarga;
    }

    @Override
    public int getPassageiro() {
        return capacidadePessoa;
    }
    
}

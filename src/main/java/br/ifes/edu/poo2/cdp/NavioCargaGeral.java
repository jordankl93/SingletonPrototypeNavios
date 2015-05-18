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
public class NavioCargaGeral extends AbstractNavio{

    public NavioCargaGeral() {
        capacidadeCarga = random.nextInt(150);
        capacidadePessoa = random.nextInt(12);
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

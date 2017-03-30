/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdd;

import java.util.List;

/**
 *
 * @author tatuapu
 */
public class Avaliador {
    private double menorValor = Double.MAX_VALUE;
    private double maiorValor = Double.MIN_VALUE;
    private List<Double> valores;
    
    public Avaliador(List<Double> vls){
        this.valores = vls;
        compara();
    }
    private void compara(){
        for (Double v:valores){
            if(v>maiorValor)
                maiorValor = v;
            if(v<menorValor)
                menorValor = v;
        }
    }
    public double getMenor(){
        return this.menorValor;
    }
    public double getMaior(){
        return this.maiorValor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tatuapu
 */
public class Testador {
    public static void main(String[] args){
        List<Double> lista = new ArrayList<>();
        lista.add(10.0);
        lista.add(100.0);
        lista.add(1000.0);
        Avaliador avaliador = new Avaliador(lista);
//        System.out.println("maior numero:"+avaliador.getMaior());
//        System.out.println("menor número:"+avaliador.getMenor());
          System.out.println(avaliador.getMaior()==1000.0);
          System.out.println(avaliador.getMenor()==10.0);
    }
}

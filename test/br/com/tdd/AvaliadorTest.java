/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tdd;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tatuapu
 */
public class AvaliadorTest {
    
    public AvaliadorTest() {
    }

    @Test
    public void deveClassificar3NumerosCrescentes(){
        List<Double> lista = new ArrayList<>();
        lista.add(10.0);
        lista.add(100.0);
        lista.add(1000.0);
        Avaliador avaliador = new Avaliador(lista);
        assertEquals(10.0, avaliador.getMenor(),0.001);
    }
    @Test
    public void deveClassificar3NumerosDecrescentes(){
        List<Double> lista = new ArrayList<>();
        lista.add(1000.0);
        lista.add(100.0);
        lista.add(10.0);
        Avaliador avaliador = new Avaliador(lista);
        assertEquals(10.0, avaliador.getMenor(),0.001);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Cajera;
import Modelos.Cliente;

/**
 *
 * @author pipet
 */
public class Preparacion_PRE_Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("a1","Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("a2","Cliente 2", new int[]{1, 3, 5, 1, 1});

        Cajera cajera1 = new Cajera("c1","Cajera 1",1);
        Cajera cajera2 = new Cajera("c2","Cajera 2",1);

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
    }
    
}

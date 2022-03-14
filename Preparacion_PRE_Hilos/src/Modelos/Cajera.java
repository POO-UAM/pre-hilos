/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author pipet
 */
public class Cajera extends Persona{

    int añosExperiencia;

    public Cajera(String cedula, String nombre,int añosExperiencia) {
        super(cedula, nombre);
        this.añosExperiencia = añosExperiencia;
    }
    public void procesarCompra(Cliente cliente, long timeStamp) {

        System.out.println("La cajera " + this.getNombre()
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000
                + "seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.getNombre() + " HA TERMINADO DE PROCESAR "
                + cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}

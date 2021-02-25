/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Logic.Formulas;

/**
 *
 * @author User
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
        Formulas f = new Formulas();
        String[] datosVentana = {"1", "2", "3", "4"};
        int num[] = f.ArrayDatos(datosVentana);
        for (int i = 0; i < num.length; i++) {
            // Imprimimos los elementos del array en pantalla.
            System.out.println("" + num[i]);
        }
        f.Media(num);
        f.Varianza(num, f.MediaCalc(num));
        f.Desviacion(num, f.MediaCalc(num));
    }

}

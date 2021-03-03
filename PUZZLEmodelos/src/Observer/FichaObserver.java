/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Cliente.Seleccion;

/**
 *
 * @author User
 */
public class FichaObserver implements TipoFicha {

    Seleccion s = new Seleccion();
    @Override
    public void actualizador(String dificultad, String categoria) {
        int dif = s.getDif();
        int cat = s.getCat();
        int f = 0, t = 0;
        String c;
            
        switch (dif) {
            case 1:
                f = 2;
                t = 280;
                if (cat == 1) {
                    c = "A";
                } else if (cat == 2) {
                    c = "B";
                } else {
                    c = "C";
                }
                break;
            case 2:
                f = 3;
                t = 180;
                if (cat == 1) {
                    c = "D";
                } else if (cat == 2) {
                    c = "E";
                } else {
                    c = "F";
                }
                break;
            case 3:
                f = 4;
                t = 140;
                if (cat == 1) {
                    c = "G";
                } else if (cat == 2) {
                    c = "H";
                } else {
                    c = "I";
                }
                break;
            case 4:
                f = 6;
                t = 93;
                if (cat == 1) {
                    c = "J";
                } else if (cat == 2) {
                    c = "K";
                } else {
                    c = "L";
                }
                break;
            case 5:
                f = 10;
                t = 56;
                if (cat == 1) {
                    c = "M";
                } else if (cat == 2) {
                    c = "N";
                } else {
                    c = "O";
                }
                break;
            default:
                break;
        }
    }

}

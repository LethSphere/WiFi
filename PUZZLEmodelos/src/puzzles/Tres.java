/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles;

import Abstract.Comun;

/**
 *
 * @author User
 */
public class Tres extends Comun{
    int Filas = 3;
    String str = "";
    int tam = 180;

    @Override
    public void setMatrix(String categoria) { //metodo para generar la matrix      
        switch (categoria) {
            case "Flores":
                str = "D";
                break;
            case "Anselmo":
                str = "E";
                break;
            case "Villada":
                str = "F";
                break;
        }
    }
    public String[] setDirImg(String categoria){
        switch (categoria) {
            case "Flores":
                str = "D";
                break;
            case "Anselmo":
                str = "E";
                break;
            case "Villada":
                str = "F";
                break;
        }
        String[] fichas = {};
        int cont=1;
        for (int i = 0; i < (Filas*Filas); i++) {
            fichas[i] = str+String.valueOf(cont);
            cont ++;
        }
        return fichas;
    }

    public int Filas() {
        return Filas;
    }

    public String Cat() {
        return str;
    }

    public int Tam() {
        return tam;
    }
}

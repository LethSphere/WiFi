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
public class Cuatro extends Comun{
    int Filas = 4;
    String str = "";
    int tam=140;

    @Override
    public void setMatrix(String categoria) { //metodo para generar la matrix      
        switch (categoria) {
            case "Flores":
                str = "G";
                break;
            case "Anselmo":
                str = "H";
                break;
            case "Villada":
                str = "I";
                break;
        }
    }
    public String[] setDirImg(String categoria){
        switch (categoria) {
            case "Flores":
                str = "G";
                break;
            case "Anselmo":
                str = "H";
                break;
            case "Villada":
                str = "I";
                break;
        }
        String[] fichas = {};
        int cont=1;
        for (int i = 0; i < (Filas*Filas); i++) {
            fichas[i] = str+cont;
            cont ++;
        }
        return fichas;
    }
    public int Filas(){
        return Filas;
    }
    public String Cat(){
        return str;
    }
    public int Tam(){
        return tam;
    }
}

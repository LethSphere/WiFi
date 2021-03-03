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
public class Dos extends Comun {

    int Filas = 2;
    String str = "";
    int tam=280;

    @Override
    public void setMatrix(String categoria) { //metodo para generar la matrix      
        switch (categoria) {
            case "Flores":
                str = "A";
                break;
            case "Anselmo":
                str = "B";
                break;
            case "Villada":
                str = "C";
                break;
        }
    }
    @Override
    public String[] setDirImg(String categoria){
        switch (categoria) {
            case "Flores":
                str = "A";
                break;
            case "Anselmo":
                str = "B";
                break;
            case "Villada":
                str = "C";
                break;
        }
        String[] fichas = {};
        int cont=1;
        for (int i = 0; i < 4; i++) {
            fichas[i] = "A"+cont;
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


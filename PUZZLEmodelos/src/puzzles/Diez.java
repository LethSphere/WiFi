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
public class Diez extends Comun{
    int Filas = 10;
    String str = "";
    int tam=56;

    @Override
    public void setMatrix(String categoria) { //metodo para generar la matrix      
        switch (categoria) {
            case "Flores":
                str = "M";
                break;
            case "Anselmo":
                str = "N";
                break;
            case "Villada":
                str = "O";
                break;
        }
    }
    public String[] setDirImg(String categoria){
        switch (categoria) {
            case "Flores":
                str = "M";
                break;
            case "Anselmo":
                str = "N";
                break;
            case "Villada":
                str = "O";
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

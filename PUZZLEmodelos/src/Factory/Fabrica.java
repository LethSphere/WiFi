/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Abstract.Comun;
import puzzles.Cuatro;
import puzzles.Diez;
import puzzles.Dos;
import puzzles.Seis;
import puzzles.Tres;

/**
 *
 * @author User
 */
public class Fabrica {
    protected int dificultad,categoria;
    
    public Fabrica(int Dif, int Cat){ 
        dificultad=Dif;
        categoria=Cat; 
    }
   
    public Comun crear_selecion(){
        if(dificultad==1){ 
            return new Dos();
        }else if(dificultad==2){
            return new Tres();
        }else if(dificultad==3){
            return new Cuatro();
        }else if(dificultad==4){
            return new Seis();
        }
        else {
            return new Diez();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sujeto;

import Observer.TipoFicha;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Ficha {
    private ArrayList <TipoFicha> Lista;
    private String tipo;
    private String sitio; 
    
    public Ficha(){
        Lista = new ArrayList<TipoFicha>();
    }
    
    public void adicionarob(TipoFicha n){
        Lista.add(n);
        
    }
    
    public void eliminarob(TipoFicha n){
        Lista.remove(n);
    }
    //
    public void notificacion(){
        for(TipoFicha n:Lista){
            n.actualizador(this.tipo , this.sitio);
        }
    }
    public void realizarAccion(String t , String s){
        this.tipo =t;
        this.sitio= s;
        notificacion();
    }
}

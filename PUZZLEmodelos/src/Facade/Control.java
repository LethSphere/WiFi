/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Cliente.Seleccion;
import Vista.Inicio;
import Vista.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import puzzles.Cuatro;
import puzzles.Diez;
import puzzles.Dos;
import puzzles.Seis;
import puzzles.Tres;

/**
 *
 * @author User
 */
public class Control implements ActionListener {

    Seleccion s = new Seleccion();
    Juego ventana = new Juego();
    Dos dos= new  Dos();
    Tres tres= new  Tres();
    Cuatro cuatro= new  Cuatro();
    Seis seis= new  Seis();
    Diez diez= new  Diez();
    private final Inicio inicio;
    int filas, tam = 0;
    String cat = "";
    String c = "";

    public Control(Inicio inicio) {
        this.inicio = inicio;
        inicio.setVisible(true);
        inicializarAcciones();
    }

    public void inicializarAcciones() {
        ventana.getBotonMenu().addActionListener(this);
        ventana.getBotonVerificar().addActionListener(this);
        inicio.getBotonInicio().addActionListener(this);
        inicio.getComboCategoria().addActionListener(this);
        inicio.getComboDificultad().addActionListener(this);
        ventana.getBotonFicha().addActionListener(this);
    }

    public int Filas() {
        return filas;
    }

    public int Tam() {
        return tam;
    }

    public String Cat() {
        return cat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evento = e.getSource();
        if (evento.equals(ventana.getBotonMenu())) { 
            System.out.println("MENU");
            ventana.setVisible(false);
            inicio.setVisible(true);
        }
        if (evento.equals(ventana.getBotonVerificar())) {
            System.out.println("VERIFICAR");
            if (ventana.verificar()==true){
                JOptionPane.showMessageDialog(null, "Felicidades");
            } else{
                JOptionPane.showMessageDialog(null, "Intenta de nuevo");
            }
        }
        if (evento.equals(ventana.getBotonFicha())) { 
            System.out.println("FICHA");
            int dif = s.getDif();
            int f=4;
            switch (dif) {
                case 1:
                    f = 4;
                    break;
                case 2:
                    f = 9;
                    break;
                case 3:
                    f = 16;
                    break;
                case 4:
                    f = 36;
                    break;
                case 5:
                    f = 100;
                    break;
                default:
                    break;
            }
            if(s.getFicha()>=f){
                s.setFicha(0);
            }
            int cont=s.getFicha()+1;
            String cad=s.getFichas()+String.valueOf(cont);
            s.setFicha(cont);
            ventana.setFicha(cad);
            
        }
        if (evento.equals(inicio.getBotonInicio())) {
            System.out.println("INICIO");
            int dif = s.getDif();
            int cat = s.getCat();
            int f = 0, t = 0;
            
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
            ventana.setFilas(f);
            ventana.setTam(t);
            ventana.setCat(c);
            ventana.setMatrix();
            s.setFicha(1);
            s.setFichas(c);
            
            String cad=c+"1";
            s.setCad(cad);
            s.setF(c+"1");
            ventana.setFicha(cad);

            inicio.setVisible(false);
            ventana.setVisible(true);
        }
        if (evento.equals(inicio.getComboCategoria())) { 
            System.out.println("CATEGORIA");
            JComboBox cb = (JComboBox) e.getSource();
            int opc = cb.getSelectedIndex();
            switch (opc) {
                case 0:
                    s.setCat(1);
                    System.out.println("Flores");
                    break;
                case 1:
                    s.setCat(2);
                    System.out.println("Anselmo");
                    break;
                case 2:
                    s.setCat(3);
                    System.out.println("Villada");
                    break;
                default:
                    break;
            }
        }
        if (evento.equals(inicio.getComboDificultad())) { 
            System.out.println("DIFICULTAD");
            JComboBox cb = (JComboBox) e.getSource();
            int opc = cb.getSelectedIndex();
            switch (opc) {
                case 0:
                    s.setDif(1);
                    System.out.println("Muy facil");
                    break;
                case 1:
                    s.setDif(2);
                    System.out.println("Facil");
                    break;
                case 2:
                    s.setDif(3);
                    System.out.println("Normal");
                    break;
                case 3:
                    s.setDif(4);
                    System.out.println("Dificil");
                    break;
                case 4:
                    s.setDif(5);
                    System.out.println("Extremo");
                    break;
                default:
                    break;
            }
        }

    }

}

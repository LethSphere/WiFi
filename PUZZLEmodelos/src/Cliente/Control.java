/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Vista.Inicio;
import Vista.Juego;
import java.awt.Color;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Control implements ActionListener {

    Juego ventana= new Juego();
    private final Inicio inicio;

    public Control(Inicio inicio) {
        this.inicio = inicio;
        inicio.setVisible(true);
        inicializarAcciones();
    }

    public void inicializarAcciones() {
        ventana.getBotonAnterior().addActionListener(this);
        ventana.getBotonColocar().addActionListener(this);
        ventana.getBotonMenu().addActionListener(this);
        ventana.getBotonSiguiente().addActionListener(this);
        ventana.getBotonVerificar().addActionListener(this);
        inicio.getBotonInicio().addActionListener(this);
        inicio.getComboCategoria().addActionListener(this);
        inicio.getComboDificultad().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evento = e.getSource();
        if (evento.equals(ventana.getBotonAnterior())) { //Ir al Home
            System.out.println("ANTERIOR");
        }
        if (evento.equals(ventana.getBotonMenu())) { //Desplegar/Ocultar menu lateral
            System.out.println("MENU");
            ventana.setVisible(false);
            inicio.setVisible(true);
        }
        if (evento.equals(ventana.getBotonColocar())) { //Ir a ubicación
            System.out.println("COLOCAR");
        }
        if (evento.equals(ventana.getBotonSiguiente())) { //Ir a contacto
            System.out.println("SIGUIENTE");
        }
        if (evento.equals(ventana.getBotonVerificar())) { //Ir a hacer una reserva
            System.out.println("VERIFICAR");
        }
        if (evento.equals(inicio.getBotonInicio())) { //Ir a hacer una reserva
            System.out.println("INICIO");
            inicio.setVisible(false);
            ventana.setVisible(true);
        }
        if (evento.equals(inicio.getComboCategoria())) { //Ir a hacer una reserva
            System.out.println("CATEGORIA");
        }
        if (evento.equals(inicio.getComboDificultad())) { //Ir a hacer una reserva
            System.out.println("DIFICULTAD");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Vista.Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class Control implements ActionListener {

    private final Juego ventana;

    public Control(Juego ventana) {
        this.ventana = ventana;
        ventana.setVisible(true);
        inicializarAcciones();
    }

    public void inicializarAcciones() {
        ventana.getBotonAnterior().addActionListener(this);
        ventana.getBotonColocar().addActionListener(this);
        ventana.getBotonMenu().addActionListener(this);
        ventana.getBotonSiguiente().addActionListener(this);
        ventana.getBotonVerificar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evento = e.getSource();
        if (evento.equals(ventana.getBotonAnterior())) { //Ir al Home
            System.out.println("ANTERIOR");
        }
        if (evento.equals(ventana.getBotonMenu())) { //Desplegar/Ocultar menu lateral
            System.out.println("MENU");
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

    }

}

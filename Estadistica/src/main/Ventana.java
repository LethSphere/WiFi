/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Ventana extends JFrame {

    private JLabel imagen;
    private JLabel jLabel1;
    private JButton desviacion, varianza, media;
    private JTextField datos; 
    Seleccion s = new Seleccion();

    public Ventana() {
        setSize(700, 400);
        setTitle("Calculadora Estadistica");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        jLabel1 = new javax.swing.JLabel();
        desviacion = new javax.swing.JButton();
        varianza = new javax.swing.JButton();
        media = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        datos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora Estadistica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 420, 60);

        desviacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desviacion.setText("Desviacion");
        desviacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desviacion.setBackground(Color.LIGHT_GRAY);
        desviacion.setContentAreaFilled(true);
        desviacion.setFocusPainted(true);
        desviacion.setEnabled(true);
        getContentPane().add(desviacion);
        desviacion.setBounds(70, 350, 150, 50);
        
        varianza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        varianza.setText("Varianza");
        varianza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        varianza.setBackground(Color.LIGHT_GRAY);
        varianza.setContentAreaFilled(true);
        varianza.setFocusPainted(true);
        varianza.setEnabled(true);
        getContentPane().add(varianza);
        varianza.setBounds(270, 350, 150, 50);
       
        media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        media.setText("Media");
        media.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        media.setBackground(Color.LIGHT_GRAY);
        media.setContentAreaFilled(true);
        media.setFocusPainted(true);
        media.setEnabled(true);
        getContentPane().add(media);
        media.setBounds(470, 350, 150, 50);
       
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoestadistica.jpg"))); // NOI18N
        getContentPane().add(imagen);
        imagen.setBounds(0, 0, 700, 410);
        
        datos.setText("Ingrese los datos");
        datos.setBounds(100, 80, 80 , 20);
    }

}



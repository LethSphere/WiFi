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

/**
 *
 * @author User
 */
public class Ventana extends JFrame {

    private JLabel imagen;
    private JLabel jLabel1;
    private JButton generar;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JComboBox lista;
    Seleccion s = new Seleccion();

    public Ventana() {
        setSize(700, 400);
        setTitle("Veterinaria asignación de citas");
        setLocationRelativeTo(null);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        jLabel1 = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculo funciones estadisticas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 420, 60);

        generar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generar.setText("Generar Cita");
        generar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generar.setBackground(Color.LIGHT_GRAY);
        generar.setContentAreaFilled(true);
        generar.setFocusPainted(true);
        generar.setEnabled(true);
        getContentPane().add(generar);
        generar.setBounds(300, 280, 100, 40);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo perritos.jpg"))); // NOI18N
        getContentPane().add(imagen);
        imagen.setBounds(0, 0, 700, 410);

        rb1.setFont(new java.awt.Font("Tahoma", 1, 12));
        rb1.setText("AM");
        rb1.setBackground(Color.LIGHT_GRAY);
        rb1.setContentAreaFilled(true);
        rb1.setFocusPainted(true);
        rb1.setEnabled(true);
        getContentPane().add(rb1);
        rb1.setBounds(300, 100, 100, 40);

        rb2.setFont(new java.awt.Font("Tahoma", 1, 12));
        rb2.setText("PM");
        rb2.setBackground(Color.LIGHT_GRAY);
        rb2.setContentAreaFilled(true);
        rb2.setFocusPainted(true);
        rb2.setEnabled(true);
        getContentPane().add(rb2);
        rb2.setBounds(300, 160, 100, 40);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        String[] opciones = {"...", "Medicina General", "Cirugia General", "Ortopedia y traumatología", "Etología", "Esterilizacion", "RX", "Toma de muestras"};
        lista = new javax.swing.JComboBox(opciones);
        lista.setBounds(250, 220, 200, 40);
        lista.setEnabled(true);
        lista.setSelectedIndex(0);
        getContentPane().add(lista);

        //eventos
        ActionListener al1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
        rb1.addActionListener(al1);
        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        };
        rb2.addActionListener(al2);

        ActionListener al3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == lista) {
                    JComboBox cb = (JComboBox) e.getSource();
                    int opc = cb.getSelectedIndex();
                }
            }
        };
        lista.addActionListener(al3);
        ActionListener al4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        generar.addActionListener(al4);
    }

}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Cliente.Seleccion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Juego extends javax.swing.JFrame {

    Seleccion s = new Seleccion();
    Inicio inicio = new Inicio();

    JButton[][] Tablero;
    private JButton imagen;
    private int fila = 2, Tam = 280;

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }
    private String Cat = "B";

    public int getTam() {
        return Tam;
    }

    public void setTam(int Tam) {
        this.Tam = Tam;
    }

    public int getFilas() {
        return fila;
    }

    public void setFilas(int Filas) {
        this.fila = Filas;
    }

    public Juego() {
        initComponents();
        this.setTitle("PUZZLE");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
    }

    public JButton getBotonMenu() {
        return jbMenu;
    }

    public JButton getBotonVerificar() {
        return jbVerificar;
    }

    public JButton getBotonFicha() {
        return bFicha;
    }

    public void setMatrix() {

        Tablero = new JButton[fila][fila];
        String img = "";
        int cont = 1;
        int x = 20;
        int y = 20;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila; j++) {
                img = "src/Img/" + Cat + String.valueOf(cont) + ".png";
                Tablero[i][j] = new JButton();
                Tablero[i][j].setBounds(x, y, getTam(), getTam());
                Tablero[i][j].setBackground(Color.DARK_GRAY);
                Tablero[i][j].setName(String.valueOf(cont));
                //Tablero[i][j].setIcon(new ImageIcon(img));

                controladorBotones bt = new controladorBotones();
                Tablero[i][j].addActionListener(bt);
                Tablero[i][j].addMouseListener(bt);
                panelFichas.add(Tablero[i][j]);

                cont++;
                x += getTam();
            }
            y += getTam();
            x = 20;
        }
    }

    public boolean verificar() {
        int cont = 1;
        boolean var = true;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < fila; j++) {
                if (String.valueOf(cont).equals(Tablero[i][j].getName())) {

                } else {
                    var = false;
                }
                cont++;
            }

        }
        return var;
    }

    public void setFicha(String i) {
        String img = "src/Img/" + i + ".png";
        bFicha.setBounds(10, 10, 180, 180);
        bFicha.setIcon(new ImageIcon(img));

    }

    public void inicializarAcciones() {
        controladorBotones bt = new controladorBotones();
        inicio.getComboCategoria().addActionListener(bt);
    }

    private class controladorBotones implements ActionListener, MouseListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < fila; j++) {

                    if (e.getSource().equals(Tablero[i][j])) {
                        String k = s.getFichas() + String.valueOf(s.getFicha());
                        String img = "src/Img/" + k + ".png";
                        Tablero[i][j].setIcon(new ImageIcon(img));
                        Tablero[i][j].setName(String.valueOf(s.getCod()));
                    }
                    if (e.getSource().equals(Tablero[0][0])) {
                        String k = "A1";
                        String img = "src/Img/" + k + ".png";
                        Tablero[0][0].setIcon(new ImageIcon(img));
                        Tablero[0][0].setName("1");
                    }
                    if (e.getSource().equals(Tablero[0][1])) {
                        String k = "A2";
                        String img = "src/Img/" + k + ".png";
                        Tablero[0][1].setIcon(new ImageIcon(img));
                        Tablero[0][1].setName("2");
                    }
                    if (e.getSource().equals(Tablero[1][0])) {
                        String k = "A3";
                        String img = "src/Img/" + k + ".png";
                        Tablero[1][0].setIcon(new ImageIcon(img));
                        Tablero[1][0].setName("3");
                    }
                    if (e.getSource().equals(Tablero[1][1])) {
                        String k = "A4";
                        String img = "src/Img/" + k + ".png";
                        Tablero[1][1].setIcon(new ImageIcon(img));
                        Tablero[1][1].setName("4");
                    }
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (SwingUtilities.isRightMouseButton(e)) {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < fila; j++) {
                        if (e.getSource().equals(Tablero[i][j])) {
                            String k = "A1";
                            String img = "src/Img/" + k + ".png";
                            Tablero[i][j].setIcon(new ImageIcon(img));
                            Tablero[i][j].setName("1");
                        }
                    }
                }
            }
            if (SwingUtilities.isMiddleMouseButton(e)) {
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < fila; j++) {
                        if (e.getSource().equals(Tablero[0][0])) {
                            String k = "D1";
                            String img = "src/Img/" + k + ".png";
                            Tablero[0][0].setIcon(new ImageIcon(img));
                            Tablero[0][0].setName("1");
                        }
                        if (e.getSource().equals(Tablero[0][1])) {
                            String k = "D2";
                            String img = "src/Img/" + k + ".png";
                            Tablero[0][1].setIcon(new ImageIcon(img));
                            Tablero[0][1].setName("2");
                        }
                        if (e.getSource().equals(Tablero[0][2])) {
                            String k = "D3";
                            String img = "src/Img/" + k + ".png";
                            Tablero[0][2].setIcon(new ImageIcon(img));
                            Tablero[0][2].setName("3");
                        }
                        if (e.getSource().equals(Tablero[1][0])) {
                            String k = "D4";
                            String img = "src/Img/" + k + ".png";
                            Tablero[1][0].setIcon(new ImageIcon(img));
                            Tablero[1][0].setName("4");
                        }
                        if (e.getSource().equals(Tablero[1][1])) {
                            String k = "D5";
                            String img = "src/Img/" + k + ".png";
                            Tablero[1][1].setIcon(new ImageIcon(img));
                            Tablero[1][1].setName("5");
                        }
                        if (e.getSource().equals(Tablero[1][2])) {
                            String k = "D6";
                            String img = "src/Img/" + k + ".png";
                            Tablero[1][2].setIcon(new ImageIcon(img));
                            Tablero[1][2].setName("6");
                        }
                        if (e.getSource().equals(Tablero[2][0])) {
                            String k = "D7";
                            String img = "src/Img/" + k + ".png";
                            Tablero[2][0].setIcon(new ImageIcon(img));
                            Tablero[2][0].setName("7");
                        }
                        if (e.getSource().equals(Tablero[2][1])) {
                            String k = "D8";
                            String img = "src/Img/" + k + ".png";
                            Tablero[2][1].setIcon(new ImageIcon(img));
                            Tablero[2][1].setName("8");
                        }
                        if (e.getSource().equals(Tablero[2][2])) {
                            String k = "D9";
                            String img = "src/Img/" + k + ".png";
                            Tablero[2][2].setIcon(new ImageIcon(img));
                            Tablero[2][2].setName("9");
                        }
                    }
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ficha = new javax.swing.JPanel();
        bFicha = new javax.swing.JButton();
        jbVerificar = new javax.swing.JButton();
        jbMenu = new javax.swing.JButton();
        panelFichas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 15, 35));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(28, 15, 35));
        jPanel1.setForeground(new java.awt.Color(28, 15, 35));

        Ficha.setBackground(new java.awt.Color(32, 18, 71));
        Ficha.setPreferredSize(new java.awt.Dimension(200, 200));

        bFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FichaLayout = new javax.swing.GroupLayout(Ficha);
        Ficha.setLayout(FichaLayout);
        FichaLayout.setHorizontalGroup(
            FichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        FichaLayout.setVerticalGroup(
            FichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jbVerificar.setFont(new java.awt.Font("8-bit pusab", 0, 14)); // NOI18N
        jbVerificar.setText("VERIFICAR");
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        jbMenu.setFont(new java.awt.Font("8-bit pusab", 0, 18)); // NOI18N
        jbMenu.setText("MENU");
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
            }
        });

        panelFichas.setBackground(new java.awt.Color(32, 18, 71));
        panelFichas.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panelFichasLayout = new javax.swing.GroupLayout(panelFichas);
        panelFichas.setLayout(panelFichasLayout);
        panelFichasLayout.setHorizontalGroup(
            panelFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelFichasLayout.setVerticalGroup(
            panelFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbVerificar)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jbMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)))
                .addComponent(panelFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Ficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbMenu)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMenuActionPerformed

    private void bFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFichaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ficha;
    private javax.swing.JButton bFicha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JPanel panelFichas;
    // End of variables declaration//GEN-END:variables
}

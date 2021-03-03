/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class Juego extends javax.swing.JFrame {

    JButton[][] Tablero;
    private JButton imagen;

    public Juego() {
        initComponents();
        this.setTitle("PUZZLE");
        setMatrix();
        setFicha();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
    }

    public JButton getBotonAnterior() {
        return jBAnterior;
    }

    public JButton getBotonColocar() {
        return jbColocar;
    }

    public JButton getBotonMenu() {
        return jbMenu;
    }

    public JButton getBotonSiguiente() {
        return jbSiguiente;
    }

    public JButton getBotonVerificar() {
        return jbVerificar;
    }

    public void setMatrix() {

        Tablero = new JButton[2][2];
        String img = "";
        int cont = 1;
        int x = 20;
        int y = 20;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                img = "src/Img/fondo.png";
                Tablero[i][j] = new JButton();
                Tablero[i][j].setBounds(x, y, 280, 280);
                Tablero[i][j].setBackground(Color.PINK);
                Tablero[i][j].setName(String.valueOf(cont));
                Tablero[i][j].setIcon(new ImageIcon(img));

                controladorBotones bt = new controladorBotones();
                Tablero[i][j].addActionListener(bt);
                Tablero[i][j].addMouseListener(bt);
                panelFichas.add(Tablero[i][j]);
                x += 280;
            }
            y += 280;
            x = 20;
        }
    }
    public void setFicha(){
        String img = "src/Img/fondo.png";
        imagen = new javax.swing.JButton();
        imagen.setBounds(10, 10, 180, 180);
        imagen.setIcon(new ImageIcon(img));
        Ficha.add(imagen);
        
    }

    private class controladorBotones implements ActionListener, MouseListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ficha = new javax.swing.JPanel();
        jBAnterior = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jbColocar = new javax.swing.JButton();
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

        javax.swing.GroupLayout FichaLayout = new javax.swing.GroupLayout(Ficha);
        Ficha.setLayout(FichaLayout);
        FichaLayout.setHorizontalGroup(
            FichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        FichaLayout.setVerticalGroup(
            FichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jBAnterior.setFont(new java.awt.Font("8-bit pusab", 0, 7)); // NOI18N
        jBAnterior.setText("ANTERIOR");
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jbSiguiente.setFont(new java.awt.Font("8-bit pusab", 0, 7)); // NOI18N
        jbSiguiente.setText("SIGUIENTE");

        jbColocar.setFont(new java.awt.Font("8-bit pusab", 0, 14)); // NOI18N
        jbColocar.setText("COLOCAR");
        jbColocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbColocarActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbVerificar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbColocar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSiguiente)
                                .addGap(60, 60, 60))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jbMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSiguiente)
                            .addComponent(jBAnterior))
                        .addGap(26, 26, 26)
                        .addComponent(jbColocar)
                        .addGap(27, 27, 27)
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

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jbColocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbColocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbColocarActionPerformed

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMenuActionPerformed

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
    private javax.swing.JButton jBAnterior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbColocar;
    private javax.swing.JButton jbMenu;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JPanel panelFichas;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Formulas {

    public int[] ArrayDatos(String datosVentana[]) {
        int num[] = new int[datosVentana.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(datosVentana[i]);
        }
        return num;
    }

    public void Media(int num[]) {
        double media = 0;
        double sumatoria = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += num[i];
        }
        media = sumatoria / num.length;
        JOptionPane.showMessageDialog(null, "La media de los datos es: " + media);
    }

    public double MediaCalc(int num[]) {
        double media = 0;
        double sumatoria = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += num[i];
        }
        media = sumatoria / num.length;
        return media;
    }

    public void Varianza(int num[], double media) {
        double sumatoria = 0;
        double varianza = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += (num[i] - media) * (num[i] - media);
        }
        varianza = sumatoria / num.length;
        JOptionPane.showMessageDialog(null, "La varianza de los datos es: " + varianza);
    }

    public void Desviacion(int num[], double media) {
        double raiz = 0;
        double sumatoria = 0;
        double desviacion = 0;
        for (int i = 0; i < num.length; i++) {
            sumatoria += (num[i] - media) * (num[i] - media);
        }
        raiz = sumatoria / num.length;
        desviacion = Math.sqrt(raiz);
        JOptionPane.showMessageDialog(null, "La desviación estándar de los datos es: " + desviacion);
    }
}


package Cliente;

import Vista.Juego;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego ventana = new Juego();
        Control programa = new Control(ventana);
    }
    
}

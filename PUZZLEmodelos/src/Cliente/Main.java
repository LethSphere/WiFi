
package Cliente;

import Vista.Inicio;
import Vista.Juego;
import puzzles.Dos;

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
        Inicio inicio = new Inicio();
        Control programa = new Control(inicio);
        Dos dos =new Dos();
        dos.setMatrix("Villada");
    }
    
}

package hscriptografador;

import br.com.schumaker.gfx.FrMain;

/**
 *
 * @author hudson schumaker HStudio - @BomRango 15/01/2015
 * @version 1.0.0
 * @since 1.0.0
 */
public class HsCriptografador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrMain().setVisible(true);
            }
        });
    }
}
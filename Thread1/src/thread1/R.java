package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

//RUNNABLE
/**
 *
 * @author pizzi.gabriele
 */
public class R implements Runnable {

    private char c;

    public R(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Ciao sono Thread, implemento runnable " + c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}

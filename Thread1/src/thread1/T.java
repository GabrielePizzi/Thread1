package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pizzi.gabriele
 */
public class T extends Thread {

    private char c;

    public T(char c) {
        this.c = c;
    }

    public void run() {
        
        while(true){
            System.out.println("Ciao sono Thread " + c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

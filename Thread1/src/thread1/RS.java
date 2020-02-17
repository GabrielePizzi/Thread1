package thread1;

//RUNNABLE SYNCHRONIZED
/**
 *
 * @author pizzi.gabriele
 */
public class RS implements Runnable {

    Thread T;
    String threadName;
    Contatore cont;

    public RS(String name, Contatore cont) {
        this.threadName = name;
        this.cont = cont;
        T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {

        System.out.println("Starting " + threadName);
//        synchronized (cont){                         //SINCRONIZZA IL CONTATORE
        cont.stampaContatore();
//        }
        System.out.println("Thread " + threadName + " exiting");
    }

} 

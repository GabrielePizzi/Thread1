package thread1;

/**
 *
 * @author pizzi.gabriele
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        T t = new T('a');
        t.start();
        T t2 = new T('b');
        t2.start();
        
        R r = new R('c');
        Thread t3 = new Thread(r);
        t3.start();
        
        R r2 = new R('d');
        Thread t4 = new Thread(r2);
        t4.start();;
    }
    
}

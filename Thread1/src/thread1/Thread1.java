package thread1;

import java.util.*;

/**
 *
 * @author pizzi.gabriele
 */
public class Thread1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*        T t = new T('a');
         t.start();
         T t2 = new T('b');
         t2.start();
        
         R r = new R('c');
         Thread t3 = new Thread(r);
         t3.start();
        
         R r2 = new R('d');
         Thread t4 = new Thread(r2);
         t4.start();
         */

//        Contatore cont = new Contatore();
//        RS r1 = new RS("thread111", cont);
//        RS r2 = new RS("thread222", cont);
        boolean g = true;
        ContoCorrente c = new ContoCorrente();
        ThreadBanca T = new ThreadBanca("cliente1" , c);
        float importo = 0;
        while (g) {
            System.out.println("Inserire la lettera corrispondente all'opzione desiderata");
            System.out.println("digita:\n 1 - per depositare\n 2 - per prelevare\n 0 - per uscire\n");
            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci l'importo da depositare");
                    importo += in.nextFloat();
                    c.setSaldo(importo);
                    System.out.println("\n il tuo saldo è di: "+c.getSaldo()+"€");
                    break;
                case 2:
                    System.out.println("Inserisci l'importo da prelevare");
                    importo -= in.nextFloat();
                    c.setSaldo(importo);
                    System.out.println("\n il tuo saldo è di: "+c.getSaldo()+"€");
                    break;
                case 0:
                    g = false;
                    break;
                default:
                    System.out.println("Parametro non corretto! Riprova!");

            }
        }

    }

    public void deposita() {

    }

    public void prelieva() {

    }

}

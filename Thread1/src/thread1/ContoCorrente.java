
package thread1;

/**
 *
 * @author pizzi.gabriele
 */
public class ContoCorrente {
    private float saldo;

    public ContoCorrente(float saldoIniziale) {
        saldo = saldoIniziale;
    }
    
    public void prelievo (float soldi){
        saldo-=soldi;
    }
    
    public void deposito(float soldi){
        saldo+=soldi;
    }
    
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    
    
}

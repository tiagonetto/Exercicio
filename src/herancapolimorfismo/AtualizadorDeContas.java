/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

/**
 *
 * @author FACULDADE
 */
public class AtualizadorDeContas {
    
    private double saldoTotal = 0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c)
    {
        System.out.println("**********************************");
        System.out.println("SaldoAnterior: "+c.getSaldo());
        c.atualiza(selic);
        System.out.println("SaldoFinal: "+c.getSaldo());
        saldoTotal +=c.getSaldo();
    }
    
    public Double GetSaldoTotal()
    {
        return this.saldoTotal;
    }
    
}

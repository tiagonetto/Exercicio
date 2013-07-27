/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

/**
 *
 * @author FACULDADE
 */
public class ContaPoupanca extends Conta{
    void atualiza(double taxa){        
        this.saldo += this.saldo * taxa *3;
    }
}

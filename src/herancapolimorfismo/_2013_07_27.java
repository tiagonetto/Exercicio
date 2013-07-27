/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapolimorfismo;

/**
 *
 * @author FACULDADE
 */
public class _2013_07_27 {
    
    public static void main(String[] args){
      Conta c = new Conta();
      ContaCorrente cc = new ContaCorrente();
      ContaPoupanca cp = new ContaPoupanca();
      c.deposita(1000);
      cc.deposita(1000);
      cp.deposita(1000);
      
      c.atualiza(0.01);
      cc.atualiza(0.01);
      cp.atualiza(0.01);
      
      System.out.println("******************");
      System.out.println(c.getSaldo());
      System.out.println(cc.getSaldo());
      System.out.println(cp.getSaldo());
      System.out.println("******************");
      
      /*Obs: O metódodo getSaldo foram sobreescritos. 
       Caso atribuisse cadas intancia extendida de contas a uma instacia de contas
       * e utilizazze somente uma vez o metodo getSALdo, iria pegar cada uma sobresescrita utiliando-se
       * do polimorfismo
       */
      
      Conta cpolimorfismo = new Conta();
      cpolimorfismo = cc;
      
      System.out.println("******************");
      System.out.println("Observe que pega o getSaldo de ContaCorrente empora esta instancia esteja atribuida a uma "
              + "instacia de CONTAS, Utilizando POLIMORFISMO.... represente a instacia com outro nome mas em tempo de"
              + "execução identifica que é um objeto ContaCorrente");
      System.out.println(cpolimorfismo.getSaldo());
      System.out.println("******************");
      
      
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Exemplo abaixo utiliza polimorfismo pois usa o método AtualizadorDeContas. que recebe Contas");
      
      Conta c1 = new Conta();
      ContaCorrente cc1 = new ContaCorrente();
      ContaPoupanca cp1 = new ContaPoupanca();
      c1.deposita(1000);
      cc1.deposita(1000);
      cp1.deposita(1000);
      
      
      AtualizadorDeContas atconta = new AtualizadorDeContas(0.01);
      System.out.println(atconta.GetSaldoTotal());
      atconta.roda(c1);
      System.out.println(atconta.GetSaldoTotal());
      atconta.roda(cc1);
      System.out.println(atconta.GetSaldoTotal());
      atconta.roda(cp1);
      System.out.println(atconta.GetSaldoTotal());
      
      
      
    }
    
}

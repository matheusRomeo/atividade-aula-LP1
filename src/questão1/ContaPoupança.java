/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão1;

/**
 *
 * @author a160001x
 */
public class ContaPoupança extends Conta{
    
    
      @Override
      public void atualiza(double percentual){
        double total;
        percentual=(percentual*this.saldo)/100;
        total= this.saldo+(percentual*3);
        
    }
}

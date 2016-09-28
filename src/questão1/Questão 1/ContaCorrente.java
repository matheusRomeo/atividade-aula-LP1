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
public class ContaCorrente  extends Conta {
    
    
     @Override
     public void atualiza(double percentual){
        double total;
        percentual=(percentual*saldo)/100;
        total= saldo+(percentual*2);
        saldo=total;
        System.out.println(saldo);
        
    }

   
      @Override
      public double Deposita(double deposito){
        this.saldo=((this.saldo+deposito)-0.10);
        return this.saldo;
    }



}


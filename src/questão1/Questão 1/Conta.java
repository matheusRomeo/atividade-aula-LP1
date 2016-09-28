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
public class Conta {
    protected double saldo;

    
    
    
    
    public double getSaldo() {
        return saldo;
    }
    
    public double Deposita(double deposito){
        this.saldo=this.saldo+deposito;
        return this.saldo;
    }
    public double Sacar(double valor){
        double saque;
        if(valor>this.saldo){
            System.out.println("valor excedido ao total da conta");
         }else{
            this.saldo=this.saldo-valor;
            
        }
    
       
    return this.saldo;
    }
    
    public void atualiza(double percentual){
        double total;
        percentual=(percentual*this.saldo)/100;
        total= this.saldo+percentual;
        this.saldo=total;
        System.out.println(this.saldo);
    }
}

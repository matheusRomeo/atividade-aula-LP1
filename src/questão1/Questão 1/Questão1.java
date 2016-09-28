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
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    Conta c = new Conta();
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupança(); 

cc.saldo=2000;

cc.Deposita(500);
        System.out.println(cc.saldo);


    }
    
}

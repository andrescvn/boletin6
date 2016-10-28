/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author acomesanavila
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Conta conta1= new Conta();
          conta1.setSaldo(5000);
          conta1.setConta("algo");
          conta1.ingreso(500);
          conta1.reintegro(200);
          conta1.setCliente("Pepe");
          conta1.visualizar();
          conta1.transferencia("destino", "origen", 500, 500, 200);
    }
   

}

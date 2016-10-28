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
public class Conta {
    private String cliente ,conta;
    private double saldo;
    public Conta (){
        
    }
    public Conta (String cliente, String conta,double saldo){
      cliente=null;
      conta=null;
      saldo=0;
    }
     public void setCliente(String cliente){
         this.cliente=cliente;
       }
     public void setConta(String conta){
         this.conta=conta;
       }
     public void setSaldo(double saldo){
           this.saldo=saldo;
       }
     public String getCliente(){
           return cliente;
       }
     public String getConta (){
         return conta;
     }
     public double getSaldo(){
         return saldo;
     }
     public void ingreso(double n){
         if (n>0)
             saldo=saldo+n;
        else
             System.out.println("error");
     }
     public void reintegro(double n){
         if (n>0&&n<saldo)
         saldo=saldo-n;    
         else
             System.out.println("error");
     }
     public void visualizar(){
         System.out.println("cliente= "+ cliente + "\n numero de conta "+ conta + "\n saldo="+ saldo);

     }
     public void transferencia(String destino,String origen,double saldo1,double saldo2, double importe){
     if (saldo1>importe){
          double saldofinal1=saldo1+importe;
          double saldofinal2=saldo2-importe;
          System.out.println("el saldo de la cuenta " + destino + " es "+ saldofinal1);
          System.out.println("el saldo de la cuenta " + origen + " es " +saldofinal2);
     }
         else
         System.out.println("error");
     }
     
}


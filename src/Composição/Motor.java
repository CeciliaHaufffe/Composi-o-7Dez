/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composição;

/**
 *
 * @author IFSC
 */
public class Motor {
   int potencia;
   
   public Motor (){
       potencia = 1000; //Valor Padrão
   }
   public Motor (int potencia){
       this.potencia = potencia;//Valor definido por Você 
   }
   
 
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

 
}

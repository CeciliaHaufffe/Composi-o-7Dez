/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composição;

/**
 * @author IFSC 
 */
public class Automovel {
    Motor motor;
    Direção direção; 

    void imptimirdadoscarro1 (){
        System.out.println ("UNO");
        System.out.println ("Cor : "+direção.cor);
        System.out.println ("Motor:" +motor.potencia );
         
    }
    void imptimirdadoscarro2 (){
        System.out.println ("GOLF");
        System.out.println ("Cor : "+direção.cor);
        System.out.println ("Motor:" +motor.potencia );
    }
    public void LigarPelaPrimeiraVez (){
        motor = new Motor ();
        direção = new Direção ();
    }
    public void LigarPelaPrimeiraVez (int potencia, String cor){
        motor = new Motor (potencia);
        direção = new Direção (cor);
    }
    public Automovel (){
        motor = new Motor ();
    }
    public Automovel (int potencia){
        motor = new Motor (potencia);
}
    }


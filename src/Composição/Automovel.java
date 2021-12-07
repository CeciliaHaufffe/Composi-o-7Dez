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
    private Direção direção; 
    
    public void LigarPelaPrimeiraVez (){
        motor = new Motor ();
    }
    public void LigarPelaPrimeiraVez (int potencia){
        motor = new Motor (potencia);
    }
    public Automovel (){
        motor = new Motor ();
    }
    public Automovel (int potencia){
        motor = new Motor (potencia);
}
}
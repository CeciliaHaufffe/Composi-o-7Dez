/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composição;

/**
 "Composição é o resproveitamnto de classes, ultilizando pela POO para
 * aumentar a produtividade e a qualidade de desenvolvimeto de software"
 * @author IFSC - Cecília Hauffe 
 */
public class Composição {
    public static void main (String []args) {
            
   // Ptirmeira Forma
    Automovel uno = new Automovel();
    Automovel Golf = new Automovel (2000);
    
   //Segunda Forma
    Automovel carro = new Automovel();
    carro.LigarPelaPrimeiraVez();
    carro.LigarPelaPrimeiraVez(1600);
   
   //Terceira Forma
     Automovel moto = new Automovel ();
     Motor motor = new Motor();
     Motor motor2 = new Motor(1600);
    
            
     
}
}

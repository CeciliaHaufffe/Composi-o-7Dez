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
     
        Automovel carro = new Automovel ();
        Automovel carro2 = new Automovel (1500 , "Verde");
   
       carro.imptimirdadoscarro1 ();
       carro2.imptimirdadoscarro2();
}
}

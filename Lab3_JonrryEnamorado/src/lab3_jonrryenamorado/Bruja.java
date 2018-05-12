/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jonrryenamorado;

import java.util.Random;

/**
 *
 * @author wende
 */
public class Bruja extends Personajes_Enemigos {


   private Random r = new Random();
    

    public Bruja(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight) {
        super(hp, ap, ad, eficacia, 1, 0, vel, "Estoy vieja", edad, "Bruja", 10, 15); 
        this.setHp(60 + r.nextInt(80));
        this.setAp(20+r.nextInt(40));
        this.setAd(5+r.nextInt(10));
        this.setEficacia(10+r.nextInt(30));
        this.setVel(r.nextInt(2)+7);

        
    }
    
   

    
}

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
public class Orco extends Personajes_Enemigos{
    Random r = new Random();

    public Orco() {
    super();
    }

    public Orco(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight) {
        super(hp, 0, ad, eficacia, crit, 0, 20, shout, edad, "Orco", 15, 250);
        this.setHp(70 + r.nextInt(90));       
        this.setAd(30+r.nextInt(45));
        this.setEficacia(20+r.nextInt(50));
        this.setCrit(0+r.nextInt(100));
    }
    
    
}

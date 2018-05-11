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
public class Elfo_Oscuro extends Personajes_Enemigos{
    Random r = new Random();

    public Elfo_Oscuro() {
    }

    public Elfo_Oscuro(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight) {
        super(hp, ap, ad, eficacia, crit, 0, 20, shout, edad, "Elfo Oscuro", 20, 250);
        this.setHp(60 + r.nextInt(120));       
        this.setAd(30+r.nextInt(50));
        this.setEficacia(50+r.nextInt(70));
        this.setCrit(0+r.nextInt(100));
    }
    
    
}

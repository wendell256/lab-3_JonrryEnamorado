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
public class Troll extends Personajes_Enemigos {
    Random r = new Random();

    

    public Troll(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight) {
        super(hp, ap, 0, eficacia, crit, 0, 10, "REEEEEEEEEEEEEEEEEEE", edad, "Troll", 13, 65);
        this.setHp(50 + r.nextInt(80));       
        this.setAd(30+r.nextInt(50));
        this.setEficacia(50+r.nextInt(65));
        this.setCrit(15+r.nextInt(20));
    }
    
    
}

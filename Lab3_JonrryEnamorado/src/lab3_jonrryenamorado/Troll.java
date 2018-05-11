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

    public Troll() {
    super();
    }

    public Troll(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight) {
        super(hp, ap, ad, eficacia, crit, luck, vel, shout, edad, name, height, weight);
        
    }
    
    
}

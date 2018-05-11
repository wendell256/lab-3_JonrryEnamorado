/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_jonrryenamorado;

/**
 *
 * @author wende
 */
public class Arquero extends Personajes_Aliados{

    public Arquero() {
        super();
    }

    public Arquero(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight, String piel, String pelo, String raza) {
        super(150, 0, 50, 85, 60, 20, 15, "Die", edad, name, height, weight, piel, pelo, raza);
    }

   
}

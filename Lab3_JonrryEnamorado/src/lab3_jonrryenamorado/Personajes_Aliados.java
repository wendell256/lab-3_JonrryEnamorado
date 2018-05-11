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
public class Personajes_Aliados extends Personajes {

    protected int hp;
    protected int ap;
    protected int ad;
    protected int eficacia;
    protected int crit;
    protected int luck;
    protected int vel;
    protected String shout;
    protected int edad;
    protected String name;
    protected int height;
    protected int weight;
    protected String piel;
    protected String pelo;
    protected String raza;

    public Personajes_Aliados() {
        super();
    }

    public Personajes_Aliados(int hp, int ap, int ad, int eficacia, int crit, int luck, int vel, String shout, int edad, String name, int height, int weight, String piel, String pelo, String raza) {
        this.hp = hp;
        this.ap = ap;
        this.ad = ad;
        this.eficacia = eficacia;
        this.crit = crit;
        this.luck = luck;
        this.vel = vel;
        this.shout = shout;
        this.edad = edad;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.piel = piel;
        this.pelo = pelo;
        this.raza = raza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        this.eficacia = eficacia;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getShout() {
        return shout;
    }

    public void setShout(String shout) {
        this.shout = shout;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Personajes_Aliados{" + "hp=" + hp + ", ap=" + ap + ", ad=" + ad + ", eficacia=" + eficacia + ", crit=" + crit + ", luck=" + luck + ", vel=" + vel + ", shout=" + shout + ", edad=" + edad + ", name=" + name + ", height=" + height + ", weight=" + weight + ", piel=" + piel + ", pelo=" + pelo + ", raza=" + raza + '}';
    }
    
}

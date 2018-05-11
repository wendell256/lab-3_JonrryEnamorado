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
public class Personajes_Aliados {
    /*protected int hp; 
    protected int ap; 
    protected int ad; 
    protected int eficacia; 
    protected int crit;
    protected int luck;
    protected int vel;
    protected String shout;*/
    protected int edad;
    protected String name;
    protected int height;
    protected int weight;
    protected String piel;
    protected String pelo;
    protected String raza;

    public Personajes_Aliados() {
    }

    public Personajes_Aliados(int edad, String name, int height, int weight, String piel, String pelo, String raza) {
        this.edad = edad;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.piel = piel;
        this.pelo = pelo;
        this.raza = raza;
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
        return "Personajes_Aliados{" + "edad=" + edad + ", name=" + name + ", height=" + height + ", weight=" + weight + ", piel=" + piel + ", pelo=" + pelo + ", raza=" + raza + '}';
    }
    
    
   

    
    
    
    
}

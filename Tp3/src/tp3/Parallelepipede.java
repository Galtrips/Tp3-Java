/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author p2103678
 */
public class Parallelepipede extends Figure3D {

    private double longueur,largeur,hauteur;
    
    public Parallelepipede(double longueur, double largeur, double hauteur){
        super("Parallelepipede");
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    @Override
    boolean estSymetrique() {
        return true;
    }

    @Override
    public double aire() {
        return (this.longueur * this.largeur * 2 + this.longueur * this.hauteur * 2 + this.hauteur * this.largeur * 2);
    }

    @Override
    public double volume() {
        return (this.longueur * this.largeur * this.hauteur);
    }
}

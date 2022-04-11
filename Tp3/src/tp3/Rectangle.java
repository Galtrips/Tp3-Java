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
public class Rectangle extends Figure2D {

    private double longueur, largeur;
    
    public Rectangle(double longueur, double largeur){
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }
    
    public Rectangle(double longueur, double largeur, String nom){
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    boolean estSymetrique() {
        return true;
    }

    @Override
    public double aire() {
        return (longueur*largeur);
    }

    @Override
    public double perimettre() {
        return ((2*largeur) + (2*longueur));
    }
}

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
public class Cercle extends Figure2D {
    private double rayon;

    public Cercle(double rayon) {
        super("Cercle");
        this.rayon = rayon;
    }
    
    @Override
    boolean estSymetrique() {
        return true;
    }

    @Override
    public double aire() {
        return (Math.PI * this.rayon*this.rayon);
    }

    @Override
    public double perimettre() {
        return (2 * Math.PI * this.rayon);
    }
}

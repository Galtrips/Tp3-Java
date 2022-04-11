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
public class Sphere extends Figure3D{
    
    private double rayon;

    public Sphere(double rayon) {
        super("Sphere");
        this.rayon = rayon;
    }
    
    @Override
    boolean estSymetrique() {
        return true;
    }

    @Override
    public double aire() {
        return (4 * Math.PI * Math.pow(this.rayon,2.0));
    }

    @Override
    public double volume() {
        return(4/3* Math.PI * Math.pow(this.rayon, 3));
    }
    
}

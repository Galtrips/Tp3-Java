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
public class Triangle extends Figure2D {
    
    private double cote1, cote2, cote3;
    
    public Triangle(double cote1, double cote2, double cote3) {
        super("Triangle");
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    @Override
    boolean estSymetrique() {
        return false;
    }

    @Override
    public double perimettre() {
        return (this.cote1 + this.cote2 + this.cote3);
    }
    
    @Override
    public double aire() {
        double s = 0.5*this.perimettre();
        return (Math.sqrt(s*(s-this.cote1)*(s-this.cote2) * (s - this.cote3)));
    } 
}

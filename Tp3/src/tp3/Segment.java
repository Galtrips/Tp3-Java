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
public class Segment extends Figure {
    private double longueur;
    
    public Segment(double longueur) {
        super("Segment");
        this.longueur = longueur;
    }
    
    @Override
    public boolean estSymetrique() {
        return true;
    }
}

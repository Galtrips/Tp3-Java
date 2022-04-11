/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 */
abstract public class Figure {
    private String nom;
    
    public Figure() {;}
    
    public Figure(String nom) {
        this.nom = nom;
    }
    
    abstract boolean estSymetrique();
}

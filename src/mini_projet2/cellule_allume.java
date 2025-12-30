/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet2;

/**
 *
 * @author mmars
 */
public class cellule_allume {
   private boolean etat;

    /**
     
     */
    public cellule_allume() {
        etat = false;
    }

    /**
     * 
     */
    public void activercellule() {
        etat = !etat;
    }

    /**
     * 
     */
    public void eteindrecellule() {
        etat = false;
    }

    /**
     * Vérifie si la cellule est éteinte.
     * @return true si éteinte, false sinon
     */
    public boolean esteteint() {
        return !etat;
    }

    /**
     * Retourne l'état de la cellule.
     * @return true si allumée, false si éteinte
     */
    public boolean getetat() {
        return etat;
    }

    /**
     * Représentation textuelle de la cellule.
     * @return "X" si allumée, "O" si éteinte
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}  


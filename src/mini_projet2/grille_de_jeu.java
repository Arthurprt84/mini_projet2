/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet2;

/**
 *
 * @author mmars
 */
public class grille_de_jeu {
    
    private cellule_allume[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public grille_de_jeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new cellule_allume[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new cellule_allume();
            }
        }
    }
    public void activerLigneDeCellules(int idLigne) {
    for (int j = 0; j < nbColonnes; j++) {
        matriceCellules[idLigne][j].activercellule();
    }
}
    
    public void activerColonneDeCellules(int idColonne) {
    for (int i = 0; i < nbLignes; i++) {
        matriceCellules[i][idColonne].activercellule();
    }
}
    public void activerDiagonaleDescendante() {
    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][i].activercellule();
    }
}

public void activerDiagonaleMontante() {
    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
        matriceCellules[i][nbColonnes - 1 - i].activercellule();
    }
}

public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (!matriceCellules[i][j].esteteint()) {
                return false;
            }
        }
    }
    return true;
}
public String toString() {
    String resultat = "   ";
    for (int j = 0; j < nbColonnes; j++) {
        resultat += "| " + j + " ";
    }
    resultat += "|\n";

    for (int i = 0; i < nbLignes; i++) {
        resultat += "---".repeat(nbColonnes + 1) + "\n";
        resultat += " " + i + " ";
        for (int j = 0; j < nbColonnes; j++) {
            resultat += "| " + matriceCellules[i][j] + " ";
        }
        resultat += "|\n";
    }
    resultat += "---".repeat(nbColonnes + 1) + "\n";
    return resultat;
}


}
 

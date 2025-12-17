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
}
 

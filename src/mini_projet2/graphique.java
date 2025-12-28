/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet2;

/**
 *
 * @author mmars
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
public class graphique extends JButton {
    private int largeur;
    private int hauteur;
    private cellule_allume celluleAssociee;

    public graphique (cellule_allume cellule, int l, int h){
        celluleAssociee = cellule;
        largeur = l;
        hauteur = h;
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        if (celluleAssociee.esteteint()) {
            g.setColor(Color.DARK_GRAY);
        } else {
            g.setColor(Color.YELLOW);
        }

        g.fillOval(4, 4, w - 8, h - 8);
    }
}

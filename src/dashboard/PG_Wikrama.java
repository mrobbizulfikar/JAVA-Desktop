/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author BACH
 */
public class PG_Wikrama extends JPanel{
    private Image image;
    public PG_Wikrama(){
        image = new ImageIcon(getClass().getResource("/gambar/logowikrama.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(image,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}

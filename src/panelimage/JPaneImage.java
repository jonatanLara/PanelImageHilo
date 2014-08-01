/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package panelimage;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jonatanLara
 */
public class JPaneImage extends JPanel {
    private Image imagen;
    
    public JPaneImage(){
        imagen=null;
    }
    public JPaneImage(String nombreimagen){
        if (nombreimagen != null) {
            imagen= new ImageIcon(getClass().getResource(nombreimagen)).getImage();
        }
    }
    public JPaneImage(Image img){
        if (img!=null) {
            imagen=img;
        }
    }
    public void setImage(String nombreimagen){
        if (nombreimagen!=null) {
            imagen = new ImageIcon(getClass().getResource(nombreimagen)).getImage();
        }else{
            imagen = null;
        }
        repaint();
    }
    public void setImage(Image nuevaimagen){
        if (nuevaimagen!=null) {
            imagen = nuevaimagen;
        }else{
            imagen = null;
        }
        repaint();
    }
    public void paint(Graphics g){
        if (imagen!= null) {
            g.drawImage(imagen, 0, 0,getWidth(),getHeight(), this);
            setOpaque(false);
        }else{
            setOpaque(true);
        }
        super.paint(g);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package panelimage;

import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author jonatanLara
 */
public class JFrameImage extends JFrame{
    private final JPaneImage modelo =new JPaneImage();
   
    public JFrameImage(){
        setContentPane(modelo);
    }
   public void setImage(String nombreimagen){
       modelo.setImage(nombreimagen);
   }
   public void setImage(Image imagennueva){
     //  modelo.setImage(imagennueva);
       modelo.setImage(imagennueva);
   }
}

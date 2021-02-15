/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.interfaces_graficas_personalizadas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalScrollBarUI;

/**
 *
 * @author Surié Delgado
 */
    
    
    public class ScrollBarCustom extends MetalScrollBarUI {
      Image thumb,track;
       private JButton b = new JButton() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(0, 0);
            }

        };
        public ScrollBarCustom(){
            thumb = AuxImage.create(32, 32, Color.DARK_GRAY);
            track = AuxImage.create(32, 32, new Color(33,33,33));
        }
        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
            g.setColor(Color.blue);
            ((Graphics2D) g).drawImage(thumb,
                r.x, r.y, r.width, r.height, null);
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle r) {
            ((Graphics2D) g).drawImage(track,
                r.x, r.y, r.width, r.height, null);
        }
         @Override
        protected JButton createDecreaseButton(int orientation) {
            return b;
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return b;
        }
    
    }

package vista.componentes;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private Color _backgroundColor = new Color(79, 79, 79);

    public PanelPrincipal(){
        super();
        setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(_backgroundColor);
        g2d.fillRect(0,0,getWidth(),getHeight());
    }
}

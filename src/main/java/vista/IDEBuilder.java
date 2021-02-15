package vista;

import vista.componentes.MainTextArea;

import javax.swing.*;
import java.awt.*;

public class IDEBuilder {
    private JPanel _panel;
    private BorderLayout _mainLayout = new BorderLayout();
    private MainTextArea _textArea = new MainTextArea();

    public IDEBuilder(JPanel panel){
        _panel = panel;
        _buildPanelComponents();
    }

    private void _buildPanelComponents(){
        _panel.setLayout(_mainLayout);
        _panel.add(_textArea, BorderLayout.WEST);
    }



    public JPanel getBuiltPanel(){return _panel;}
}

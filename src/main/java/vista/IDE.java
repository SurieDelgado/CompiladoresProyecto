package vista;

import vista.componentes.PanelPrincipal;
import vista.interfaces_graficas_personalizadas.UIManagerModule;

import javax.swing.*;
import java.awt.*;

public class IDE {

    private PanelPrincipal _mainPanel = new PanelPrincipal();
    private JFrame _frame;
    private JMenuBar _menuBar;


    public IDE(){
        _buildFrame();
        _mainPanel = (PanelPrincipal) new IDEBuilder(_mainPanel).getBuiltPanel();
        _addToFrame(_mainPanel);
        _initializeMenuBar();
        _showFrame();
    }

    private void _initializeMenuBar(){
        UIManagerModule.setMenuBarUI();

        _menuBar = new JMenuBar();
        JMenu m = new JMenu("Archivo");
            m.add(_itemMenu("Abrir"));
            m.add(_itemMenu("Cerrar"));
            m.add(_itemMenu("Guardar"));
            m.add(_itemMenu("Guardar Como"));
        _menuBar.add(m);

        m = new JMenu("Editar");
        _menuBar.add(m);

        m = new JMenu("Formato");
        _menuBar.add(m);

        m = new JMenu("Compilar");
        _menuBar.add(m);

        m = new JMenu("Ayuda");
        _menuBar.add(m);

        _menuBar.add(m);
        _frame.setJMenuBar(_menuBar);

    }

    private JMenuItem _itemMenu(String title){
        JMenuItem menu = new JMenuItem(title);
        return menu;
    }

    private void _buildFrame(){
        _frame = new JFrame("ISC IDE");
        _frame.setSize(new Dimension(1280,720));
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void _showFrame(){
        _frame.setVisible(true);
    }

    public void _addToFrame(JComponent component){
        _frame.add(component);
    }

    public void addToMainPanel(JComponent component){

    }
}

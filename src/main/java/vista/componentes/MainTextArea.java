package vista.componentes;

import vista.interfaces_graficas_personalizadas.JTextLineNumber;
import vista.interfaces_graficas_personalizadas.ScrollBarCustom;
import vista.interfaces_graficas_personalizadas.UIManagerModule;

import javax.swing.*;
import java.awt.*;

public class MainTextArea extends JScrollPane {

    private JTextArea _textArea;
    private JScrollBar _barra;
    private JTextLineNumber  _lineCounter;
    private JPanel _panel = new JPanel(new BorderLayout());

    public MainTextArea(){
        UIManagerModule.setTextAreaUI();
        _textArea = new JTextArea(32,50);
        _textArea.setTabSize(2);

        _lineCounter = new JTextLineNumber(_textArea);
        _panel.add(_lineCounter, BorderLayout.WEST);
        _panel.add(_textArea, BorderLayout.CENTER);
        setViewportView(_panel);

        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        _barra = getVerticalScrollBar();
        _barra.setUI(new ScrollBarCustom());
        _barra = getHorizontalScrollBar();
        _barra.setUI(new ScrollBarCustom());
    }
}

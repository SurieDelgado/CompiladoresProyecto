package vista.interfaces_graficas_personalizadas;

import javax.swing.*;
import java.awt.*;

public class UIManagerModule {

    public static void setMenuBarUI(){
        UIManager.put("MenuBar.background" ,new Color(79, 79, 79));
        UIManager.put("MenuBar.borderColor",new Color(79, 79, 79));
        UIManager.put("MenuBar.highlight"  ,new Color(79, 79, 79));
        UIManager.put("MenuBar.shadow"     ,new Color(79, 79, 79));
        UIManager.put("MenuBar.darkShadow" ,new Color(79, 79, 79));

        UIManager.put("Menu.background"         ,new Color(79, 79, 79));
        UIManager.put("Menu.foreground"         ,new Color(255, 255, 255));
        UIManager.put("Menu.border"             ,new Insets (0,0,0,0));
        UIManager.put("Menu.selectionBackground",new Color (0, 166, 50));
        UIManager.put("Menu.selectionForeground",new Color (255, 255, 255));

        UIManager.put("MenuItem.foreground"         ,new Color(255, 255, 255));
        UIManager.put("MenuItem.background"         ,new Color(79, 79, 79));
        UIManager.put("MenuItem.selectionBackground",new Color (0, 209, 63));
        UIManager.put("MenuItem.selectionForeground",new Color (255, 255, 255));
        UIManager.put("MenuItem.opaque", true);
    }

    public static void setTextAreaUI(){
        UIManager.put("TextArea.background"     ,new Color(54, 54, 54));
        UIManager.put("TextArea.foreground"     ,new Color(255, 255, 255));
        UIManager.put("TextArea.caretForeground",new Color(255, 255, 255));
    }

}

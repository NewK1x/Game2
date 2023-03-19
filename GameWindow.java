package main;


import GuiP.GUI;

import javax.swing.*;
import java.awt.*;

public class GameWindow  {

    private JFrame jFrame;


    public GameWindow(GPanel gPanel){
        jFrame = new JFrame("Project test");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gPanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.requestFocus();
        jFrame.pack();
        jFrame.setVisible(true);

    }

}

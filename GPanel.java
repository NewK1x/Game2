package main;

import Entity.Enemy;
import Entity.Player;
import GuiP.GUI;
import Inputs.Keybooards;
import Inputs.MouseInputs;
import Maps.Grass;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GPanel extends JPanel {
    GameWindow gameWindow;

    private ArrayList<Enemy> enemies;
    public Player player;
    private Grass grassArray;

    public int SizeX = 1280;
    public int SizeY = 780;

    private final int FPS = 60; // счетчик Кадров в секунду
    public GPanel(){ // конструктор
        addKeyListener(new Keybooards(this)); // добавление обработчика клавиатур
        addMouseListener(new MouseInputs(this)); // добавление обработчика Нажатия мышы
        addMouseMotionListener(new MouseInputs(this));
        int centerX = (1280 - 50) / 2;
        int centerY = (780 - 50) / 2;
        player = new Player(centerX,centerY,this);

        add(new GUI(player),BorderLayout.SOUTH);
        setPanelsize();
       Thread thread = new Thread(() -> {
            while (true) {
                long startTime = System.currentTimeMillis();
                update();
                long elapsedTime = System.currentTimeMillis() - startTime;
                long sleepTime = 1000 / FPS - elapsedTime;
                if (sleepTime > 0) {
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }


    private void setPanelsize() {
        Dimension size = new Dimension(SizeX, SizeY);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        grassArray.draw(g);
        player.draw(g);
    }
    public void update(){
        repaint();
    }

}

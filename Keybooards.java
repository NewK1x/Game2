package Inputs;

import Entity.Player;
import main.GPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keybooards implements KeyListener {
    private GPanel gPanel;



    public Keybooards(GPanel gPanel){
        this.gPanel = gPanel;
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                // Движение вверх
                gPanel.player.y -= 5;
                break;
            case KeyEvent.VK_S:
                // Движение вниз
                gPanel.player.y += 5;
                break;
            case KeyEvent.VK_A:
                // Движение влево
                gPanel.player.x -= 5;
                break;
            case KeyEvent.VK_D:
                // Движение вправо
                gPanel.player.x += 5;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

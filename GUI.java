package GuiP;

import Entity.Player;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    private Player player;
    public GUI(Player player){
        this.player = player;
        setPreferredSize(new Dimension(1280,780));
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial",Font.BOLD,24));
        g.drawString("Health" + player.healthPoints, getWidth() - 150,g.getFontMetrics().getHeight());
    }
}

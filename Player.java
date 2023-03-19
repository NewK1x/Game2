package Entity;

import main.GPanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Player extends Entity{


    private BufferedImage img;
    public int healthPoints;
    GPanel gPanel;
    public Player(int x, int y, GPanel gPanel) {
        super(x, y);
        this.gPanel = gPanel;
        ImportImg();
        healthPoints = 100;
    }
    private void ImportImg(){
        InputStream is = getClass().getResourceAsStream("/test_entity.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getWidth(){
        return img.getWidth();
    }
    public int getHeight(){
        return img.getHeight();
    }

    public void draw(Graphics g){
        g.drawImage(img,x,y,null);
    }

}

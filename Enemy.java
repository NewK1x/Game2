package Entity;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Enemy extends Entity{
    public int speed;
    public int radius;
    BufferedImage img;
    public Enemy(int x, int y,int speed,int radius) {
        super(x, y);
        this.speed = speed;
        this.radius = radius;
        ImportImg();
    }
    public void moveFollowPlayer(Player player){
        int dx = player.x - x;
        int dy = player.y - y;
        double distance = Math.sqrt(dx*dx+dy+dy);

        if(distance < radius){
            x += speed * dx / distance;
            y += speed * dy / distance;
        }
    }
    private void ImportImg(){
        InputStream is = getClass().getResourceAsStream("/test_entity.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void draw(Graphics g){
        g.drawImage(img,x,y,null);
    }
}

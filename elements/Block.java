package elements;

import utils.RandomColorGenerator;
import java.awt.Color;
import java.awt.Graphics;

public class Block {
    public Color color;
    public Block() {
        RandomColorGenerator randColor = new RandomColorGenerator();
        this.color = randColor.getRandomColor();
    }

    public void draw(Graphics g, int scale, int x, int y) {
        int px = x * scale + 1; // the adjustment will draw the blackline between blocks
        int py = y * scale + 1;

        int size = scale - 2;

        g.setColor(color);
        g.fillRect(px, py, size, size);
    }

}

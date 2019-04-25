package utils;

import java.awt.Color;
import java.util.Random;

public class RandomColorGenerator {
    private static Color[] colors = {Color.red, Color.blue, Color.magenta,
            Color.orange, Color.green, Color.cyan, Color.yellow};

    public Color getRandomColor () {
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }
}

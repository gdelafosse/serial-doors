package test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.StreamSupport;

public class A {

    public static void main(String[] args) throws IOException {



        double[] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};

        double[] empty = {5, -5};

        double r = Arrays.stream(empty).reduce((a, b) -> {
            double diff = Math.abs(a) - Math.abs(b);
            if (diff == 0) {
                return a >=0 ? a : b;
            } else {
                return diff > 0 ? b : a;
            }
        }).getAsDouble();
        System.out.println(r);

    }

}
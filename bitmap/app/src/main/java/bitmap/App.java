package bitmap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
public class App {
    public static void main(String[] args) {
//        String inputFile = "app/src/main/resources/rgbIm.bmp";
//        String outputFile = "app/src/main/resources/updeted.bmp";
        String inputFile=args[0];
        String outputFile=args[1];
        Bitmap bitmap = new Bitmap(inputFile);

        if(args[2].equals("convertToBlackAndWhite"))
       bitmap.convertToBlackAndWhite();
        else if(args[2].equals("addBorder"))
        bitmap.addBorder(12);
        else
        bitmap.verticallyMirror();

        boolean writeSuccessful = bitmap.writeToFile(outputFile);
        if (writeSuccessful) {
            System.out.println("Image written successfully.");
        } else {
            System.out.println("Image writing failed.");
        }
    }
}
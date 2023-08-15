package bitmap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
public class App {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\main\\resources\\rgbIm.bmp";
        String outputFile = "C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\main\\resources\\rgbImEdited.bmp";
        Bitmap bitmap = new Bitmap(inputFile);
        bitmap.convertToBlackAndWhite();
        bitmap.addBorder(12);
        bitmap.verticallyMirror();

        boolean writeSuccessful = bitmap.writeToFile(outputFile);
        if (writeSuccessful) {
            System.out.println("Image written successfully.");
        } else {
            System.out.println("Image writing failed.");
        }
    }
}
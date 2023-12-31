/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testAddBorder()
    {
        Bitmap testBit =new Bitmap("C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbIm.bmp");
        String outputFile = "C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbImEdit.bmp";
        testBit.addBorder(20);
        assertEquals(true, testBit.writeToFile(outputFile));
    }

    @Test
    void testconvertToBlackAndWhite()
    {
        Bitmap testBit =new Bitmap("C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbIm.bmp");
        String outputFile = "C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbImEdit.bmp";
        testBit.convertToBlackAndWhite();
        assertEquals(true, testBit.writeToFile(outputFile));
    }

    @Test
    void testVerticallyMirror()
    {
        Bitmap testBit =new Bitmap("C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbIm.bmp");
        String outputFile = "C:\\Users\\farah\\java-projects\\bitmap-transformer\\bitmap\\app\\src\\test\\resources\\rgbImEdit.bmp";
        testBit.verticallyMirror();
        assertEquals(true, testBit.writeToFile(outputFile));
    }
}

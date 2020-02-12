import java.io.*;
import java.util.Scanner;

public class demo1 {
    public static void main(String arg[]) throws FileNotFoundException {
       PrintWriter printWriter = new PrintWriter(new File("E:\\逆战NZ1902\\test.txt"));
        printWriter.write("99999");
        printWriter.close();
    }
}

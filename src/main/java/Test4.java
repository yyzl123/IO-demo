import java.io.*;

public class Test4 {
    public static void main(String arg[]) throws Exception {
        File file = new File("E:" + File.separator + "逆战NZ1902", "test1.txt");
        FileUtils.copy(file);
    }

}
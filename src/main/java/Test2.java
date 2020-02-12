import java.io.File;
import java.io.FileInputStream;

public class Test2 {
    public static void main(String arg[]) throws Exception {
        File file = new File("E:" + File.separator + "逆战NZ1902", "test1.txt");
        FileInputStream  fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len = fileInputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

    }
}
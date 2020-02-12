import java.io.*;


public class Test3 {
    public static void main(String arg[]) throws Exception {
        File file = new File("E:" + File.separator + "逆战NZ1902", "test1.txt");
        InputStream inputStream = new FileInputStream(file);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = new byte[10];
        int len = bufferedInputStream.read(bytes);
        System.out.println(new String(bytes ,0,len));
        bufferedInputStream.mark(99);

        byte[] bytes2 = new byte[10];
        int len2= bufferedInputStream.read(bytes2);
        System.err.println(new String(bytes2,0,len2));

        bufferedInputStream.reset();

        byte[] bytes3 = new byte[10];
        int len3= bufferedInputStream.read(bytes3);
        System.err.println(new String(bytes3,0,len3));
        System.err.println(bufferedInputStream.markSupported());
    }
}

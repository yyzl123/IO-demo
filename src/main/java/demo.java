import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String arg[]) throws  Exception {
     String qf = "QIANFEN";
     ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(qf.getBytes());
     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
     int t;
     while (-1 != (t = byteArrayInputStream.read())){
         t += 32;
         byteArrayOutputStream.write(t);
         System.out.println(byteArrayOutputStream.toString());
     }
     System.out.println(byteArrayOutputStream.toString());
    }

}

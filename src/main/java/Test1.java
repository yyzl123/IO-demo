import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Test1 {
    public static void main(String arg[]) throws  Exception{
        File file = new File("E:"+File.separator+"逆战NZ1902","test1.txt");


         System.out.println("文件最后一次修改的时间:"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(file.lastModified()) ));
    }

}

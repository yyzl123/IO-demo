import java.io.*;

public class FileUtils {
    public  static boolean copy(File originFile) throws Exception {
        InputStream inputStream = new FileInputStream( originFile);
        String newFileName=  originFile.getParent()+ File.separator;
        String oldFileName =  originFile.getName();
        newFileName += oldFileName.substring(0,oldFileName.lastIndexOf("."))
                +"-副本"+oldFileName.substring(0,oldFileName.lastIndexOf("."));
        OutputStream outputStream = new FileOutputStream(new File(newFileName));
        byte bytes[] = new byte[8192];
        int len =0;
        while(-1 != (len = inputStream.read(bytes))){
            outputStream.write(bytes,0,len);
        }
        inputStream .close();
        outputStream.close();
        return  true;
    }
}

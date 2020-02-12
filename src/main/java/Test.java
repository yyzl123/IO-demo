import java.io.File;

public class Test {
    public static void main(String arg[]) throws  Exception{
        File f = new File("E:\\逆战NZ1902");
        deleteFile(f);
    }
    public static void deleteFile(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files){
                if (f.isFile()){
                    System.out.println("已经被删除的文件:" +f);
                    f.delete();}
                else if(file.isDirectory()){
                    deleteFile(f);
                }
            }
            System.out.println("已经被删除的文件夹:"+ file);
            file.delete();
        }
        System.out.println("已经被删除的文件:"+ file);
        file.delete();
    }
}

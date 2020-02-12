import java.io.*;
import java.util.Date;

public class user1 {
    public static  void main (String args[])throws IOException,ClassNotFoundException {

        User user = new User();
        user.setName("千分");
        user.setBirthday(new Date());
        user.setAge(20);
        user.setMoney(7000.0);
        user.setPassword("123456");
        user.setPhone("139710628093");

        OutputStream outputStream = new FileOutputStream(new File("E:\\逆战NZ1902\\test.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        InputStream inputStream = new FileInputStream((new File("E:\\逆战NZ1902\\test.txt")));
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o);

    }
}

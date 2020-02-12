import java.io.*;
import java.net.URI;

public class NZFile extends File {
    public NZFile(String pathname) {
        super(pathname);
    }

    public NZFile(String parent, String child) {
        super(parent, child);
    }

    public NZFile(File parent, String child) {
        super(parent, child);
    }

    public NZFile(URI uri) {
        super(uri);
    }



}

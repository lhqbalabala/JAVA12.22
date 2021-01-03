import java.io.*;
public class exam1 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(new File("C:/AuI18N/1.txt"));
        FileOutputStream out = new FileOutputStream(new File("C:/AuI18N/2.txt"));
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();

    }
}
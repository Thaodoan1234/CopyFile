import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file2.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int ch;
            ch = bis.read();
            while (ch != -1) {
                bos.write(ch);
                ch = bis.read();
            }
            bos.flush();
            bis.close();
            bos.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}

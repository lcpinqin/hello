import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class IOHandle
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("f1.txt");
        
        File f2 = new File("f2.txt");
        OutputStream os = new FileOutputStream(f1);
        byte[] b = "abcde".getBytes();
        os.write(b);
        os.close();
    }
    
}

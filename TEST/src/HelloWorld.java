import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do
        {
            c = (char)br.read();
            System.out.println(c);
        }
        while (c !='q');
    }
    
}

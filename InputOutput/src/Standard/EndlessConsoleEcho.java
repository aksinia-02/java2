package Standard;

import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.*;

public class EndlessConsoleEcho {

    public static void main(String[] args) {
        while(true){
            try {
                int code = in.read();
                out.write(code);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

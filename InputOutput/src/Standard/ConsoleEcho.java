package Standard;

import java.io.IOException;

import static java.lang.System.*;

public class ConsoleEcho {

    public static void main(String[] args) {
        try {
            boolean empty = true;
            int lines = 1;
            int chars = 0;
            for(int code = in.read(); code >= 0; code = in.read()){
                chars++;
                if(code == '\n')
                    lines++;
                out.write(code);
                empty = false;
            }
            if(empty)
                err.println("Empty input");
            else
                out.printf("%d Zeichen, %d Zeile(n)%n", chars, lines);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

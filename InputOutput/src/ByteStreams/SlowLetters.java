package ByteStreams;

import static java.lang.System.out;

public class SlowLetters {
    public static void main(String[] args) {
        int letter = 'A';
        while(true){
            out.println(letter);
            out.flush();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            letter++;
            if(letter > 'Z')
                letter = 'A';
        }
    }
}

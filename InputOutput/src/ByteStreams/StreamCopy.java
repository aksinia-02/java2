package ByteStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopy {
    public static void main(String[] args) {
        try (InputStream input = System.in; OutputStream output = System.out;) {
            for (int code = input.read(); code >= 0; code = input.read()) {
                output.write(code);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

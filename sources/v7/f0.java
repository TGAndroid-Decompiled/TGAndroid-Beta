package v7;

import java.io.IOException;
public abstract class f0 {
    public static void a(Appendable appendable, char c10) {
        try {
            appendable.append(c10);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}

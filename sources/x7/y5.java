package x7;

import java.io.IOException;
public abstract class y5 {
    public static void a(Appendable appendable, char c2) {
        try {
            appendable.append(c2);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

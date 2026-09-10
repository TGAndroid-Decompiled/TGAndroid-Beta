package w7;

import java.io.Closeable;
public abstract class l6 {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                v7.s7.a(th2, th3);
            }
        }
    }
}

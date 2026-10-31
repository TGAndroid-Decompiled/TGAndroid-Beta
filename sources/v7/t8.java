package v7;

import java.io.Closeable;
public abstract class t8 {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                i8.d.a(th2, th3);
            }
        }
    }
}

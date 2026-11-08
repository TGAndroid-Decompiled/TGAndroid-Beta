package y7;

import a8.za;
public abstract class g9 {
    public static za f59033a;

    public static synchronized e9 a(b9 b9Var) {
        e9 e9Var;
        synchronized (g9.class) {
            try {
                if (f59033a == null) {
                    f59033a = new za(3);
                }
                e9Var = (e9) f59033a.R0(b9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e9Var;
    }
}

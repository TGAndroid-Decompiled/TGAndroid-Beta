package x7;

import b8.ng;
public abstract class d9 {
    public static ng f58267a;

    public static synchronized b9 a(y8 y8Var) {
        b9 b9Var;
        synchronized (d9.class) {
            try {
                if (f58267a == null) {
                    f58267a = new ng(2);
                }
                b9Var = (b9) f58267a.R0(y8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b9Var;
    }
}

package y7;

import a8.ab;
public abstract class f9 {
    public static ab f60248a;

    public static synchronized d9 a(a9 a9Var) {
        d9 d9Var;
        synchronized (f9.class) {
            try {
                if (f60248a == null) {
                    f60248a = new ab(3);
                }
                d9Var = (d9) f60248a.R0(a9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d9Var;
    }
}

package y7;

import a8.ab;
public abstract class g9 {
    public static ab f60947a;

    public static synchronized e9 a(b9 b9Var) {
        e9 e9Var;
        synchronized (g9.class) {
            try {
                if (f60947a == null) {
                    f60947a = new ab(3);
                }
                e9Var = (e9) f60947a.R0(b9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e9Var;
    }
}

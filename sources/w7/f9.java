package w7;

import a8.qg;
public abstract class f9 {
    public static qg f50851a;

    public static synchronized d9 a(a9 a9Var) {
        d9 d9Var;
        synchronized (f9.class) {
            try {
                if (f50851a == null) {
                    f50851a = new qg(2);
                }
                d9Var = (d9) f50851a.R0(a9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d9Var;
    }
}

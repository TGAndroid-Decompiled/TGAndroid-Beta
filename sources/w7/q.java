package w7;

import a8.za;
public abstract class q {
    public static za f57620a;

    public static synchronized p a(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (f57620a == null) {
                    f57620a = new za(2);
                }
                pVar = (p) f57620a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}

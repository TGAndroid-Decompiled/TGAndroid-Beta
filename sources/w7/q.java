package w7;

import a8.za;
public abstract class q {
    public static za f57619a;

    public static synchronized p a(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (f57619a == null) {
                    f57619a = new za(2);
                }
                pVar = (p) f57619a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}

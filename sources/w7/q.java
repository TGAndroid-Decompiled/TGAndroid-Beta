package w7;

import a8.ab;
public abstract class q {
    public static ab f59663a;

    public static synchronized p a(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (f59663a == null) {
                    f59663a = new ab(2);
                }
                pVar = (p) f59663a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}

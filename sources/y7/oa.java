package y7;

import b8.ng;
public abstract class oa {
    public static ng f59239a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f59239a == null) {
                    f59239a = new ng(3);
                }
                maVar = (ma) f59239a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}

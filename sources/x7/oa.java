package x7;

import a8.qg;
public abstract class oa {
    public static qg f51600a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f51600a == null) {
                    f51600a = new qg(3);
                }
                maVar = (ma) f51600a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}

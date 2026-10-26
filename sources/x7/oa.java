package x7;

import a8.qg;
public abstract class oa {
    public static qg f51603a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (f51603a == null) {
                    f51603a = new qg(3);
                }
                maVar = (ma) f51603a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}

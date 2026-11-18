package q6;
public final class n implements l {
    public static n f55939b;
    public static final o f55940c = new o(0, 0, 0, false, false);
    public Object f55941a;

    public n(Object obj) {
        this.f55941a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f55939b == null) {
                    f55939b = new Object();
                }
                nVar = f55939b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object o(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f55941a;
        dVar.f6395a = rVar;
        return dVar;
    }
}

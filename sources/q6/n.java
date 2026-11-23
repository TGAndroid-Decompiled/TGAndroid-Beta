package q6;
public final class n implements l {
    public static n f55949b;
    public static final o f55950c = new o(0, 0, 0, false, false);
    public Object f55951a;

    public n(Object obj) {
        this.f55951a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f55949b == null) {
                    f55949b = new Object();
                }
                nVar = f55949b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object o(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f55951a;
        dVar.f6390a = rVar;
        return dVar;
    }
}

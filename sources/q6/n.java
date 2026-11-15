package q6;
public final class n implements l {
    public static n f55365b;
    public static final o f55366c = new o(0, 0, 0, false, false);
    public Object f55367a;

    public n(Object obj) {
        this.f55367a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f55365b == null) {
                    f55365b = new Object();
                }
                nVar = f55365b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object q(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f55367a;
        dVar.f6115a = rVar;
        return dVar;
    }
}

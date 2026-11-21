package q6;
public final class n implements l {
    public static n f55980b;
    public static final o f55981c = new o(0, 0, 0, false, false);
    public Object f55982a;

    public n(Object obj) {
        this.f55982a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f55980b == null) {
                    f55980b = new Object();
                }
                nVar = f55980b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object o(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f55982a;
        dVar.f6424a = rVar;
        return dVar;
    }
}

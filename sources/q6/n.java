package q6;
public final class n implements l {
    public static n f55984b;
    public static final o f55985c = new o(0, 0, 0, false, false);
    public Object f55986a;

    public n(Object obj) {
        this.f55986a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f55984b == null) {
                    f55984b = new Object();
                }
                nVar = f55984b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object o(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f55986a;
        dVar.f6427a = rVar;
        return dVar;
    }
}

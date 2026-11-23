package q6;
public final class n implements l {
    public static n f56062b;
    public static final o f56063c = new o(0, 0, 0, false, false);
    public Object f56064a;

    public n(Object obj) {
        this.f56064a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f56062b == null) {
                    f56062b = new Object();
                }
                nVar = f56062b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object n(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.f56064a;
        dVar.f6389a = rVar;
        return dVar;
    }
}

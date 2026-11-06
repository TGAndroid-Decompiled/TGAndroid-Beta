package q6;
public final class n implements l {
    public static n f53799b;
    public static final o f53800c = new o(0, 0, 0, false, false);
    public Object f53801a;

    public n(Object obj) {
        this.f53801a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f53799b == null) {
                    f53799b = new Object();
                }
                nVar = f53799b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        p8.d dVar = (p8.d) this.f53801a;
        dVar.f3500a = qVar;
        return dVar;
    }
}

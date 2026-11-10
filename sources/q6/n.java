package q6;
public final class n implements l {
    public static n f53928b;
    public static final o f53929c = new o(0, 0, 0, false, false);
    public Object f53930a;

    public n(Object obj) {
        this.f53930a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f53928b == null) {
                    f53928b = new Object();
                }
                nVar = f53928b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        p8.d dVar = (p8.d) this.f53930a;
        dVar.f3503a = qVar;
        return dVar;
    }
}

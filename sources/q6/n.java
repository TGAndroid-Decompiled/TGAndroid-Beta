package q6;
public final class n implements l {
    public static n f53823b;
    public static final o f53824c = new o(0, 0, 0, false, false);
    public Object f53825a;

    public n(Object obj) {
        this.f53825a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f53823b == null) {
                    f53823b = new Object();
                }
                nVar = f53823b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        p8.d dVar = (p8.d) this.f53825a;
        dVar.f3500a = qVar;
        return dVar;
    }
}

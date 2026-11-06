package q6;
public final class n implements l {
    public static n f53824b;
    public static final o f53825c = new o(0, 0, 0, false, false);
    public Object f53826a;

    public n(Object obj) {
        this.f53826a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f53824b == null) {
                    f53824b = new Object();
                }
                nVar = f53824b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object b(com.google.android.gms.common.api.q qVar) {
        p8.d dVar = (p8.d) this.f53826a;
        dVar.f3500a = qVar;
        return dVar;
    }
}

package p6;
public final class n implements l {
    public static n f53293b;
    public static final o f53294c = new o(0, 0, 0, false, false);
    public Object f53295a;

    public n(Object obj) {
        this.f53295a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f53293b == null) {
                    f53293b = new Object();
                }
                nVar = f53293b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public Object m(com.google.android.gms.common.api.q qVar) {
        o8.d dVar = (o8.d) this.f53295a;
        dVar.f6076a = qVar;
        return dVar;
    }
}

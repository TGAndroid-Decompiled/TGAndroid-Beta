package x5;
public final class m implements k {
    public static m f48954b;
    public static final n f48955c = new n(0, 0, 0, false, false);
    public Object f48956a;

    public m(Object obj) {
        this.f48956a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f48954b == null) {
                    f48954b = new Object();
                }
                mVar = f48954b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override
    public Object d(com.google.android.gms.common.api.q qVar) {
        w7.d dVar = (w7.d) this.f48956a;
        dVar.f108a = qVar;
        return dVar;
    }
}

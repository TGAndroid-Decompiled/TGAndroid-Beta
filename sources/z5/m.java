package z5;
public final class m implements k {
    public static m f50654b;
    public static final n f50655c = new n(0, 0, 0, false, false);
    public Object f50656a;

    public m(Object obj) {
        this.f50656a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (f50654b == null) {
                    f50654b = new Object();
                }
                mVar = f50654b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        y7.d dVar = (y7.d) this.f50656a;
        dVar.f306a = qVar;
        return dVar;
    }
}

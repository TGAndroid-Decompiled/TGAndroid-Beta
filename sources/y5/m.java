package y5;

public final class m implements k {

    public static m f49671b;

    public static final n f49672c = new n(0, 0, 0, false, false);

    public Object f49673a;

    public m(Object obj) {
        this.f49673a = obj;
    }

    public static synchronized m a() {
        try {
            if (f49671b == null) {
                f49671b = new m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49671b;
    }

    @Override
    public Object c(com.google.android.gms.common.api.q qVar) {
        x7.d dVar = (x7.d) this.f49673a;
        dVar.f2040a = qVar;
        return dVar;
    }
}

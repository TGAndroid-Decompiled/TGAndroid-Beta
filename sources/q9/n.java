package q9;
public final class n implements pa.b {
    public static final Object f41473c = new Object();
    public volatile Object f41474a = f41473c;
    public volatile pa.b f41475b;

    public n(pa.b bVar) {
        this.f41475b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41474a;
        Object obj3 = f41473c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41474a;
                    if (obj == obj3) {
                        obj = this.f41475b.get();
                        this.f41474a = obj;
                        this.f41475b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return obj;
        }
        return obj2;
    }
}

package q9;
public final class n implements pa.b {
    public static final Object f46077c = new Object();
    public volatile Object f46078a = f46077c;
    public volatile pa.b f46079b;

    public n(pa.b bVar) {
        this.f46079b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46078a;
        Object obj3 = f46077c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46078a;
                    if (obj == obj3) {
                        obj = this.f46079b.get();
                        this.f46078a = obj;
                        this.f46079b = null;
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

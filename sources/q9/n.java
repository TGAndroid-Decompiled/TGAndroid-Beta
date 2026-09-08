package q9;
public final class n implements pa.b {
    public static final Object f44263c = new Object();
    public volatile Object f44264a = f44263c;
    public volatile pa.b f44265b;

    public n(pa.b bVar) {
        this.f44265b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44264a;
        Object obj3 = f44263c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44264a;
                    if (obj == obj3) {
                        obj = this.f44265b.get();
                        this.f44264a = obj;
                        this.f44265b = null;
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

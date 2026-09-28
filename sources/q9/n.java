package q9;
public final class n implements pa.b {
    public static final Object f41487c = new Object();
    public volatile Object f41488a = f41487c;
    public volatile pa.b f41489b;

    public n(pa.b bVar) {
        this.f41489b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41488a;
        Object obj3 = f41487c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41488a;
                    if (obj == obj3) {
                        obj = this.f41489b.get();
                        this.f41488a = obj;
                        this.f41489b = null;
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

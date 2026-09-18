package q9;
public final class n implements pa.b {
    public static final Object f41225c = new Object();
    public volatile Object f41226a = f41225c;
    public volatile pa.b f41227b;

    public n(pa.b bVar) {
        this.f41227b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41226a;
        Object obj3 = f41225c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41226a;
                    if (obj == obj3) {
                        obj = this.f41227b.get();
                        this.f41226a = obj;
                        this.f41227b = null;
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

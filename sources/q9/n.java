package q9;
public final class n implements pa.b {
    public static final Object f41194c = new Object();
    public volatile Object f41195a = f41194c;
    public volatile pa.b f41196b;

    public n(pa.b bVar) {
        this.f41196b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41195a;
        Object obj3 = f41194c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41195a;
                    if (obj == obj3) {
                        obj = this.f41196b.get();
                        this.f41195a = obj;
                        this.f41196b = null;
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

package q9;
public final class n implements pa.b {
    public static final Object f41220c = new Object();
    public volatile Object f41221a = f41220c;
    public volatile pa.b f41222b;

    public n(pa.b bVar) {
        this.f41222b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41221a;
        Object obj3 = f41220c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41221a;
                    if (obj == obj3) {
                        obj = this.f41222b.get();
                        this.f41221a = obj;
                        this.f41222b = null;
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

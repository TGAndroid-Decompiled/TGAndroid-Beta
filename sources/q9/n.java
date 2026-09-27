package q9;
public final class n implements pa.b {
    public static final Object f41517c = new Object();
    public volatile Object f41518a = f41517c;
    public volatile pa.b f41519b;

    public n(pa.b bVar) {
        this.f41519b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41518a;
        Object obj3 = f41517c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41518a;
                    if (obj == obj3) {
                        obj = this.f41519b.get();
                        this.f41518a = obj;
                        this.f41519b = null;
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

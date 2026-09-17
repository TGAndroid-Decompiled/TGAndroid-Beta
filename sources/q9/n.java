package q9;
public final class n implements pa.b {
    public static final Object f44264c = new Object();
    public volatile Object f44265a = f44264c;
    public volatile pa.b f44266b;

    public n(pa.b bVar) {
        this.f44266b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44265a;
        Object obj3 = f44264c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44265a;
                    if (obj == obj3) {
                        obj = this.f44266b.get();
                        this.f44265a = obj;
                        this.f44266b = null;
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

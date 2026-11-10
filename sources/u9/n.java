package u9;
public final class n implements ua.b {
    public static final Object f56491c = new Object();
    public volatile Object f56492a = f56491c;
    public volatile ua.b f56493b;

    public n(ua.b bVar) {
        this.f56493b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56492a;
        Object obj3 = f56491c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56492a;
                    if (obj == obj3) {
                        obj = this.f56493b.get();
                        this.f56492a = obj;
                        this.f56493b = null;
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

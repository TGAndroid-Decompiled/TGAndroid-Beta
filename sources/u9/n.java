package u9;
public final class n implements ua.b {
    public static final Object f56492c = new Object();
    public volatile Object f56493a = f56492c;
    public volatile ua.b f56494b;

    public n(ua.b bVar) {
        this.f56494b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56493a;
        Object obj3 = f56492c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56493a;
                    if (obj == obj3) {
                        obj = this.f56494b.get();
                        this.f56493a = obj;
                        this.f56494b = null;
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

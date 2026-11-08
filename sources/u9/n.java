package u9;
public final class n implements ua.b {
    public static final Object f56479c = new Object();
    public volatile Object f56480a = f56479c;
    public volatile ua.b f56481b;

    public n(ua.b bVar) {
        this.f56481b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56480a;
        Object obj3 = f56479c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56480a;
                    if (obj == obj3) {
                        obj = this.f56481b.get();
                        this.f56480a = obj;
                        this.f56481b = null;
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

package u9;
public final class n implements ua.b {
    public static final Object f56480c = new Object();
    public volatile Object f56481a = f56480c;
    public volatile ua.b f56482b;

    public n(ua.b bVar) {
        this.f56482b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56481a;
        Object obj3 = f56480c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56481a;
                    if (obj == obj3) {
                        obj = this.f56482b.get();
                        this.f56481a = obj;
                        this.f56482b = null;
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

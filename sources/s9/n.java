package s9;
public final class n implements ra.b {
    public static final Object f48007c = new Object();
    public volatile Object f48008a = f48007c;
    public volatile ra.b f48009b;

    public n(ra.b bVar) {
        this.f48009b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f48008a;
        Object obj3 = f48007c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f48008a;
                    if (obj == obj3) {
                        obj = this.f48009b.get();
                        this.f48008a = obj;
                        this.f48009b = null;
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

package s9;
public final class n implements ra.b {
    public static final Object f48004c = new Object();
    public volatile Object f48005a = f48004c;
    public volatile ra.b f48006b;

    public n(ra.b bVar) {
        this.f48006b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f48005a;
        Object obj3 = f48004c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f48005a;
                    if (obj == obj3) {
                        obj = this.f48006b.get();
                        this.f48005a = obj;
                        this.f48006b = null;
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

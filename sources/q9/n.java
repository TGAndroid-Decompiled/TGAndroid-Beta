package q9;
public final class n implements pa.b {
    public static final Object f45978c = new Object();
    public volatile Object f45979a = f45978c;
    public volatile pa.b f45980b;

    public n(pa.b bVar) {
        this.f45980b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45979a;
        Object obj3 = f45978c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45979a;
                    if (obj == obj3) {
                        obj = this.f45980b.get();
                        this.f45979a = obj;
                        this.f45980b = null;
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

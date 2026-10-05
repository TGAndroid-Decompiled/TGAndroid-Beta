package q9;
public final class n implements pa.b {
    public static final Object f44877c = new Object();
    public volatile Object f44878a = f44877c;
    public volatile pa.b f44879b;

    public n(pa.b bVar) {
        this.f44879b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44878a;
        Object obj3 = f44877c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44878a;
                    if (obj == obj3) {
                        obj = this.f44879b.get();
                        this.f44878a = obj;
                        this.f44879b = null;
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

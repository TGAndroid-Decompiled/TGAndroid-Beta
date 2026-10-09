package q9;
public final class n implements pa.b {
    public static final Object f46033c = new Object();
    public volatile Object f46034a = f46033c;
    public volatile pa.b f46035b;

    public n(pa.b bVar) {
        this.f46035b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46034a;
        Object obj3 = f46033c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46034a;
                    if (obj == obj3) {
                        obj = this.f46035b.get();
                        this.f46034a = obj;
                        this.f46035b = null;
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

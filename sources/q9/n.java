package q9;
public final class n implements pa.b {
    public static final Object f44863c = new Object();
    public volatile Object f44864a = f44863c;
    public volatile pa.b f44865b;

    public n(pa.b bVar) {
        this.f44865b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44864a;
        Object obj3 = f44863c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44864a;
                    if (obj == obj3) {
                        obj = this.f44865b.get();
                        this.f44864a = obj;
                        this.f44865b = null;
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

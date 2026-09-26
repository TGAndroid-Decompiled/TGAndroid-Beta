package q9;
public final class n implements pa.b {
    public static final Object f41486c = new Object();
    public volatile Object f41487a = f41486c;
    public volatile pa.b f41488b;

    public n(pa.b bVar) {
        this.f41488b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41487a;
        Object obj3 = f41486c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41487a;
                    if (obj == obj3) {
                        obj = this.f41488b.get();
                        this.f41487a = obj;
                        this.f41488b = null;
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

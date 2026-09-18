package q9;
public final class n implements pa.b {
    public static final Object f41459c = new Object();
    public volatile Object f41460a = f41459c;
    public volatile pa.b f41461b;

    public n(pa.b bVar) {
        this.f41461b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41460a;
        Object obj3 = f41459c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41460a;
                    if (obj == obj3) {
                        obj = this.f41461b.get();
                        this.f41460a = obj;
                        this.f41461b = null;
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

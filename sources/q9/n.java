package q9;
public final class n implements pa.b {
    public static final Object f46142c = new Object();
    public volatile Object f46143a = f46142c;
    public volatile pa.b f46144b;

    public n(pa.b bVar) {
        this.f46144b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46143a;
        Object obj3 = f46142c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46143a;
                    if (obj == obj3) {
                        obj = this.f46144b.get();
                        this.f46143a = obj;
                        this.f46144b = null;
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

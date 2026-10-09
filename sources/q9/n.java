package q9;
public final class n implements pa.b {
    public static final Object f46031c = new Object();
    public volatile Object f46032a = f46031c;
    public volatile pa.b f46033b;

    public n(pa.b bVar) {
        this.f46033b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46032a;
        Object obj3 = f46031c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46032a;
                    if (obj == obj3) {
                        obj = this.f46033b.get();
                        this.f46032a = obj;
                        this.f46033b = null;
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

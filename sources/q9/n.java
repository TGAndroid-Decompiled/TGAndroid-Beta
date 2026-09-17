package q9;
public final class n implements pa.b {
    public static final Object f44236c = new Object();
    public volatile Object f44237a = f44236c;
    public volatile pa.b f44238b;

    public n(pa.b bVar) {
        this.f44238b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44237a;
        Object obj3 = f44236c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44237a;
                    if (obj == obj3) {
                        obj = this.f44238b.get();
                        this.f44237a = obj;
                        this.f44238b = null;
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

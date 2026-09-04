package q9;
public final class n implements pa.b {
    public static final Object f44235c = new Object();
    public volatile Object f44236a = f44235c;
    public volatile pa.b f44237b;

    public n(pa.b bVar) {
        this.f44237b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44236a;
        Object obj3 = f44235c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44236a;
                    if (obj == obj3) {
                        obj = this.f44237b.get();
                        this.f44236a = obj;
                        this.f44237b = null;
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

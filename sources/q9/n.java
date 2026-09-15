package q9;
public final class n implements pa.b {
    public static final Object f41198c = new Object();
    public volatile Object f41199a = f41198c;
    public volatile pa.b f41200b;

    public n(pa.b bVar) {
        this.f41200b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41199a;
        Object obj3 = f41198c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41199a;
                    if (obj == obj3) {
                        obj = this.f41200b.get();
                        this.f41199a = obj;
                        this.f41200b = null;
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

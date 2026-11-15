package u9;
public final class m implements ua.b {
    public static final Object f57987c = new Object();
    public volatile Object f57988a = f57987c;
    public volatile ua.b f57989b;

    public m(ua.b bVar) {
        this.f57989b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f57988a;
        Object obj3 = f57987c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f57988a;
                    if (obj == obj3) {
                        obj = this.f57989b.get();
                        this.f57988a = obj;
                        this.f57989b = null;
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

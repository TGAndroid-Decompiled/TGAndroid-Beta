package q9;
public final class n implements pa.b {
    public static final Object f41500c = new Object();
    public volatile Object f41501a = f41500c;
    public volatile pa.b f41502b;

    public n(pa.b bVar) {
        this.f41502b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41501a;
        Object obj3 = f41500c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41501a;
                    if (obj == obj3) {
                        obj = this.f41502b.get();
                        this.f41501a = obj;
                        this.f41502b = null;
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
